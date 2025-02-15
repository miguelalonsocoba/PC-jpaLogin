package com.pc.login.jpa_login.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username", length = 255, nullable = false, unique = true)
    private String username;

    @Column(name = "role", length = 255, nullable = false)
    private String role;

    @Column(name = "password", length = 255, nullable = false)
    private String password;
}
