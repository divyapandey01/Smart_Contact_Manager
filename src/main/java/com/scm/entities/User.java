package com.scm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity(name = "user")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {
    @Id
    private String userId;
    @Column(name = "user_name", nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    private String about;
    private String profilePic;
    private String phoneNumber;
    //information
    private boolean enabled = false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;
    //Providers
    private Providers providers = Providers.SELF;
    private String providerUserId;
}
