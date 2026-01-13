/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurant.backend.adapter.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class InfoController {

    @Value("${spring.application.name:RestaurantApp}")
    private String appName;

    @Value("${spring.profiles.active:default}")
    private String activeProfile;

    @GetMapping("/info")
    public Map<String, String> getInfo() {
        return Map.of(
                "appName", appName,
                "version", "0.0.1-SNAPSHOT",
                "profile", activeProfile,
                "port", "8080"
        );
    }
}
