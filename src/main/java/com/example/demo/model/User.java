package com.example.demo.model;

import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;


    @Column(nullable = false)
    private String lastName;


    @Column(nullable = false)
    private double height;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    public User() {
        this.role = Role.USER;
    }

    public User(String firstName, String lastName, double height, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.role = role != null ? role : Role.USER;
    }

    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public double getHeight() { return height; }
    public Role getRole() { return role; }


    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setHeight(double height) { this.height = height; }
    public void setRole(Role role) { this.role = role != null ? role : Role.USER; }
}