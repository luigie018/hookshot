package com.xyz.oot.hookshot.repository;

import com.xyz.oot.hookshot.entity.ConversationMembers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ConversationMembersRepository extends JpaRepository<ConversationMembers, UUID> {
}
