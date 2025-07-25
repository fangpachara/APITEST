package com.example.apitest.controller;

import com.example.apitest.dto.SsoResponse;
import com.example.apitest.dto.SsoUserModel;
import com.example.apitest.service.SsoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    private final SsoService ssoService;


    public controller(SsoService ssoService) {
        this.ssoService = ssoService;
    }

    @PostMapping("/gentoken")
    public ResponseEntity<SsoResponse> gentoken(@RequestBody SsoUserModel model){
        SsoResponse response = ssoService.saveData(model);
        return ResponseEntity.ok(response);
    }

}
