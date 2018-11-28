package com.example.demo.controller;

import com.example.demo.DemoApplication;
import com.example.demo.client.PropublicaClient;
import com.example.demo.model.PropublicaRoot;
import com.example.demo.payroll.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.swing.*;

@RestController
@RequestMapping("/propublica")
public class PropublicaController extends DemoApplication {

    @GetMapping("/all")
    public void getAll() {
        PropublicaClient propublicaClient = new PropublicaClient();
        Mono<PropublicaRoot> root = propublicaClient.getSenatorByState("mo");
        root.subscribe(item -> System.out.println(item.getCopyright()));
    }

//    @GetMapping("/{id}")
//    private Mono<PropublicaRoot> getEmployeeById(@PathVariable String id) {
////        return propublicaRepository.findById(id);
//    }
//
//    @GetMapping
//    private Flux<PropublicaRoot> getAllSenators(){
////        return propublicaRepository.findAllSenator();
//    }

}
