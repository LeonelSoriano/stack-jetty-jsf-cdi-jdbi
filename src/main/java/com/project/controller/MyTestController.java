package com.project.controller;

import com.project.until.Ejemplo;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Created by leonel on 25/10/16.
 */

@ManagedBean
@ViewScoped
public class MyTestController {



    private String saludo;

    @PostConstruct
    public void init(){
        new Ejemplo();
        this.saludo = "hola soy un saludo";
    }


    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }




}
