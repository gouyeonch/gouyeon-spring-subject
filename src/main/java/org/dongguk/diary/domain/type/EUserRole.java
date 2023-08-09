package org.dongguk.diary.domain.type;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum EUserRole {
    USER("USER"),
    ADMIN("ADMIN");

    private final String role;

    @Override
    public String toString() {
        return role;
    }
}