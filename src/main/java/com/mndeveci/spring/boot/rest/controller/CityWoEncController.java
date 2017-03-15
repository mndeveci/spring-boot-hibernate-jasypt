package com.mndeveci.spring.boot.rest.controller;

import com.mndeveci.spring.boot.rest.model.CityWoEnc;
import com.mndeveci.spring.boot.rest.repository.CityWoEncRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cities-wo-enc")
public class CityWoEncController {

    @Autowired
    private CityWoEncRepository cityWoEncRepository;

    @RequestMapping("/")
    public Iterable<CityWoEnc> listCitiesWoEnc() {
        return cityWoEncRepository.findAll();
    }

}
