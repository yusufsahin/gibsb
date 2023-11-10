package com.example.sfg301integration.dao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private Long id;
    private  String firstName;
    private  String lastName;
    private  String phoneNumber;
}
