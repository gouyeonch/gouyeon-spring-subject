package org.dongguk.diary.repository;

import org.dongguk.diary.domain.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Long> {
    Optional<Diary> findById(Long did);
}
