package com.example.RestAPI.service;

import com.example.RestAPI.model.IBGENotice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IBGEService {

    private final String BASE_URL = "https://servicodados.ibge.gov.br/api/v3/noticias";

    private final RestTemplate restTemplate;

    @Autowired
    public IBGEService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public IBGENotice[] getNoticiasEreleases() {
        return restTemplate.getForObject(BASE_URL, IBGENotice[].class);
    }

    public IBGENotice[] getNoticias() {
        return restTemplate.getForObject(BASE_URL + "/?tipo=noticia", IBGENotice[].class);
    }

    public IBGENotice[] getReleases() {
        return restTemplate.getForObject(BASE_URL + "/?tipo=release", IBGENotice[].class);
    }
}
