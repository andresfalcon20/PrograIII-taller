package com.itsqmet.ProyectoPrograIII.Controlador;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClinicaHControlador {
    @GetMapping("/index")
    public String mostrarHome(){
        return "index";
    }

}
