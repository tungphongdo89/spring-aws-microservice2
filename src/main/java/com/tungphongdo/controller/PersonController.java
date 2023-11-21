package com.tungphongdo.controller;

import com.tungphongdo.entity.Person;
import com.tungphongdo.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = {"/person"})
@Slf4j
public class PersonController {

    private final PersonService personService;


    @GetMapping
    public ResponseEntity<List<Person>> getAllPersons(){
        return ResponseEntity.ok(personService.getAllPersons());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Integer id){
        return ResponseEntity.ok(personService.getPersonById(id));
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        return ResponseEntity.ok(personService.createPerson(person));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePersonById(@PathVariable Integer id){
        return ResponseEntity.ok(personService.deletePersonById(id));
    }

}
