package com.example.demo.client;

import com.example.demo.DemoApplication;
import com.example.demo.model.PropublicaRoot;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PropublicaClient {

    public Mono<PropublicaRoot> getSenatorByState(String state) {
        WebClient propublicClient = WebClient.builder()
                .baseUrl("https://api.propublica.org/congress/v1/members/senate/" + state + "/current.json")
                .defaultHeader("x-api-key", "SpzjlPZlkMlPKKGCLQS1OqZtCN96lPl7sszOTKra")
                .build();

        return propublicClient.get()
                .retrieve()
                .bodyToMono(PropublicaRoot.class);

    }
}
