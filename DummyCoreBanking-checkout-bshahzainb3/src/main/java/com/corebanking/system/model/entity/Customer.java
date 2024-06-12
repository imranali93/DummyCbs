package com.corebanking.system.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "cbs_customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mobileNumber;
    private String firstName;
    private String lastName;
    private String cnic;
    @NotBlank(message = "email must be required")
    private String email;
    private String userName;
    private String password;
    private String securityPicture;
    @OneToMany(mappedBy = "customer")
            @JsonManagedReference
    private List<Account> accountList;
}
