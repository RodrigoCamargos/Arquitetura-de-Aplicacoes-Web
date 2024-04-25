package com.example.RestAPI.controller;

import com.example.RestAPI.model.IBGENotice;
import com.example.RestAPI.service.IBGEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IBGEController {

    private final IBGEService ibgeService;

    @Autowired
    public IBGEController(IBGEService ibgeService) {
        this.ibgeService = ibgeService;
    }

    @GetMapping("/noticiasereleases")
    public IBGENotice[] getNoticiasEreleases() {
        return ibgeService.getNoticiasEreleases();
    }

    @GetMapping("/noticias")
    public IBGENotice[] getNoticias() {
        return ibgeService.getNoticias();
    }

    @GetMapping("/releases")
    public IBGENotice[] getReleases() {
        return ibgeService.getReleases();
    }
}
