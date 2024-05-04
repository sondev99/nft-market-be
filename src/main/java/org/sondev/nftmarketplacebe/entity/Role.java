package org.sondev.nftmarketplacebe.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;

@Entity
@Table(name = "roles")
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Role {
    @Id
    @UuidGenerator
    @Column(name = "role_id", unique = true, nullable = false, updatable = false)
    String roleId;

    @Column(name = "role_name",nullable = false)
    String roleName;

    @ManyToMany
    List<User> users;
}
