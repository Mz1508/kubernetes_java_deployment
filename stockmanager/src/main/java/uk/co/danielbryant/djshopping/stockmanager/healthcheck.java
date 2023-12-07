 package com.example.springbootmanagementexample;
 package uk.co.danielbryant.djshopping.stockmanager;
 
 import java.util.Date;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RestController;
 
 @RestController
 public class healthcheck {
     @GetMapping("/health")
     public String health() {
         return "Hello User this is Stockmanager !! " + new Date();
     }
 }
