package org.dongguk.diary.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.dongguk.diary.domain.type.ELoginProvider;
import org.dongguk.diary.domain.type.EUserRole;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "users")
@DynamicUpdate
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "social_id", nullable = false)
    private String socialId;

    @Column(name = "provider", nullable = false)
    @Enumerated(EnumType.STRING)
    private ELoginProvider provider;

    @Column(name = "role", nullable = false)
    private EUserRole role;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "refresh_token")
    private String refreshToken;

    @Builder
    public User(String socialId, ELoginProvider provider, EUserRole role, String name) {
        this.socialId = socialId;
        this.provider = provider;
        this.name = name;
        this.role = role;
        this.createdDate = Timestamp.valueOf(LocalDateTime.now());
    }

    public void updateRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
