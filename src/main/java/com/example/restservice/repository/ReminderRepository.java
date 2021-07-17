package com.example.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restservice.model.Reminder;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder, Integer> {}
