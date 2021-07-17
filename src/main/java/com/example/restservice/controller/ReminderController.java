package com.example.restservice.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.model.Reminder;
import com.example.restservice.repository.ReminderRepository;
import com.example.restservice.exception.InvalidInputException;
import com.example.restservice.exception.ResourceNotFoundException;


@RestController
public class ReminderController {

  @Autowired
  private ReminderRepository reminderRepository;


  @GetMapping("/reminder")
  public List<Reminder> getAll() {
    return reminderRepository.findAll();
  }

 
  @GetMapping("/reminder/{id}")
  public Reminder getById(@PathVariable("id") Integer reminderId) throws ResourceNotFoundException {
    Reminder reminder =
        reminderRepository
            .findById(reminderId)
            .orElseThrow(() -> new ResourceNotFoundException("There is no reminder with the id of " + reminderId));
    return reminder;
  }


  @PostMapping("/reminder")
  public Reminder create(@Valid @RequestBody Reminder reminder) {
    return reminderRepository.save(reminder);
  }


  @PutMapping("/reminder/{id}")
  public Reminder update(@PathVariable("id") Integer reminderId, @Valid @RequestBody Reminder reminderData) throws ResourceNotFoundException, InvalidInputException {
    Reminder reminder =
        reminderRepository
            .findById(reminderId)
            .orElseThrow(() -> new ResourceNotFoundException("There is no reminder with the id of " + reminderId));
    reminder.setTitle (reminderData.getTitle());
    reminder.setDate(reminderData.getDate());
    final Reminder updatedReminder = reminderRepository.save(reminder);
    return updatedReminder;
  }


  @DeleteMapping("/reminder/{id}")
  public void delete(@PathVariable("id") Integer reminderId) throws Exception {
    Reminder reminder =
        reminderRepository
            .findById(reminderId)
            .orElseThrow(() -> new ResourceNotFoundException("There is no reminder with the id of " + reminderId));

    reminderRepository.delete(reminder);
  }
}