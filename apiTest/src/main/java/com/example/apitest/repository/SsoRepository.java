package com.example.apitest.repository;

import com.example.apitest.entity.SsoUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface SsoRepository extends JpaRepository<SsoUserEntity, LocalDateTime> {
}
