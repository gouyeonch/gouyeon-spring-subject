package org.dongguk.diary.repository;

import org.dongguk.diary.entity.Diary;

import java.util.Optional;

public interface DiaryRepository {
    Optional<Diary> findByDid(Integer did);
}
