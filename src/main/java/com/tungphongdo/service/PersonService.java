//package com.tungphongdo.service;
//
//import com.tungphongdo.entity.Person;
//import com.tungphongdo.repository.PersonRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class PersonService {
//
//    private final PersonRepository personRepository;
//
//    public List<Person> getAllPersons(){
//        return personRepository.findAll();
//    }
//
//    public Person getPersonById(Integer id){
//        return personRepository.findById(id).orElseThrow();
//    }
//
//    public Person createPerson(Person person){
//        return personRepository.save(person);
//    }
//
//    public String deletePersonById(Integer id){
//        personRepository.deleteById(id);
//        return "Deleted person successfully";
//    }
//}
