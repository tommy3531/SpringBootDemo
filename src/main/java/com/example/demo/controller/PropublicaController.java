package com.example.demo.controller;

import com.example.demo.DemoApplication;
import com.example.demo.client.PropublicaClient;
import com.example.demo.model.Member;
import com.example.demo.model.PropublicaRoot;
import com.example.demo.model.Result;
import com.example.demo.payroll.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.swing.*;
import javax.websocket.server.PathParam;
import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping("/propublica")
public class PropublicaController extends DemoApplication {

    @GetMapping("/all")
    public Flux<Member> getAll() {
        PropublicaClient propublicaClient = new PropublicaClient();
        Flux<PropublicaRoot> root = propublicaClient.getSenatorByState();
        Flux<Result> results = root.flatMap(result -> Flux.fromIterable(result.getResults()));
        Flux<Member> members = results.flatMap(member -> Flux.fromIterable(member.getMembers()));
        return members;
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
