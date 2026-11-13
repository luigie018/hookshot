package com.xyz.oot.hookshot.repository;

import com.xyz.oot.hookshot.entity.Conversations;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ConversationRepository extends JpaRepository<Conversations, UUID> {
}
