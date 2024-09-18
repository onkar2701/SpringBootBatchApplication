package com.spring.batch_app.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.batch.item.file.LineMapper;

@Table(name = "customer_info")
@Data
@AllArgsConstructor
public class Customer {
    @Id
    @Column(name = "CUSTOMER_ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "CONTACT")
    private String contactNo;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "DOB")
    private String dob;

}
