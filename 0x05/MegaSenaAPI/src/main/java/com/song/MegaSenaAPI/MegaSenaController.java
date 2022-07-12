package com.song.MegaSenaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value = "/megasena")
public class MegaSenaController {

    @GetMapping("/simpleMessageWelcome")
    public String mensagemBoasVindas() {
        return "Bem vindo a API REST para geração de números para a loteria Mega Sena.";
    }

    @GetMapping("/getNumbers")
    public List<Integer> numerosMegaSena() {
        Set<Integer> listaNumeros = new TreeSet<>();
        Random random = new Random();

        while (listaNumeros.size() < 6) {
            listaNumeros.add(random.nextInt(100));
        }

        return new ArrayList<>(listaNumeros);
    }
}
