package com.gf.application;

import com.gf.controller.Controller;
import com.gf.entities.Trabajadores;
import com.gf.view.View;

public class App {
    public static void main(String[] args) {
        View view=new View();
        Trabajadores modelo=new Trabajadores();
        Controller controlador=new Controller(modelo, view);
        
        controlador.setFrame();
   }
}
