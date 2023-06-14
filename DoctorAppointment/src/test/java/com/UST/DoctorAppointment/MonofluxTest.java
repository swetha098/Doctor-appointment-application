package com.UST.DoctorAppointment;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonofluxTest {

    @Test
    public void testMono(){
        Mono<?> monoString = Mono.just("javatechie")
        .then(Mono.error(new RuntimeException("Exception occured")))
                .log();
        monoString.subscribe(System.out::println,(e)->System.out.println(e.getMessage()));
    }
    @Test
    public void testFlux(){
        Flux<String> fluxString = Flux.just("Spring","Spring Boot","Hibernate","microservice")
                .concatWithValues("cloud")
                .log();

        fluxString.subscribe(System.out::println,(e)->System.out.println(e.getMessage()));
    }
}
