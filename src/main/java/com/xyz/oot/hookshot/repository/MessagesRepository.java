package com.xyz.oot.hookshot.repository;

import com.xyz.oot.hookshot.entity.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MessagesRepository extends JpaRepository<Messages, UUID> {
}
