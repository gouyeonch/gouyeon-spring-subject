package org.dongguk.diary.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@DynamicUpdate //엔티티 객체가 바뀌면 디비 자동으로 업데이트
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Builder
    public User(String name, Timestamp createdDate) {
        this.name = name;
        this.createdDate = createdDate;
    }
}
