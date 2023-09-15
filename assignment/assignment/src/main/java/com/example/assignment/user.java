
package com.example.assignment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String userName;
    private String address;
    private String phoneNumber;

    // Constructors, getters, and setters can be generated using Lombok or manually.
}
