package org.dongguk.diary.repository;

import org.dongguk.diary.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
