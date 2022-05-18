package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aplicacion {

    @RequestMapping("/")
   public String saludar(){
       return "Bom día";
   }

   @RequestMapping("/despidete")
   public String despidete(){
       return "Sale mimir";
   }

}
