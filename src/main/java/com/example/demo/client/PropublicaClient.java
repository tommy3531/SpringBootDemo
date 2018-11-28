package com.example.demo.client;

import com.example.demo.DemoApplication;
import com.example.demo.model.PropublicaRoot;
import com.example.demo.model.Result;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PropublicaClient {

    public Flux<PropublicaRoot> getSenatorByState() {
        WebClient propublicClient = WebClient.builder()
                .baseUrl("https://api.propublica.org/congress/v1/115/senate/members.json")
                .defaultHeader("x-api-key", "SpzjlPZlkMlPKKGCLQS1OqZtCN96lPl7sszOTKra")
                .build();

        return propublicClient.get()
                .retrieve()
                .bodyToFlux(PropublicaRoot.class).log();

    }
}
