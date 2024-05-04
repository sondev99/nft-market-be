package org.sondev.nftmarketplacebe.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.UuidGenerator;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @UuidGenerator
    @Column(name = "user_id", unique = true, nullable = false, updatable = false)
    String userId;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    @Column(name = "avatar_url")
    String avatarUrl;

    @Column(name = "phone")
    String phone;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    Status status;

    @ManyToMany
    List<Role> roles;
}
