package com.example.sneha1.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Student{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
     String name;
     int age;
}

     


