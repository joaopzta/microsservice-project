package com.joaopzta.workerservice.controller;

import com.joaopzta.workerservice.entities.*;
import com.joaopzta.workerservice.repositories.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

    private final WorkerRepository workerRepository;

    public WorkerController(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        var list = workerRepository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable("id") Long id) {
        var worker = workerRepository.findById(id);
        return worker.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

}
