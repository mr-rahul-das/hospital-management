package com.hospital.hospitalmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Min(value = 0, message = "Age cannot be negative")
    @Max(value = 150, message = "Age is too high")
    private int age;

    @NotBlank(message = "Gender is required")
    private String gender;

    @Pattern(regexp = "\\d{10}", message = "Phone must be 10 digits")
    private String phone;

    @Email(message = "Invalid email")
    private String email;

    private String address;

    public Patient() {
    	
    }

    public Patient(Long id, String name, int age, String gender, String phone, String email, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Long getId() { 
    	return id; 
    	}
    public void setId(Long id) { 
    	this.id = id;
    	}

    public String getName() { 
    	return name; 
    	}
    public void setName(String name) { 
    	this.name = name;
    	}

    public int getAge() { 
    	return age; 
    	}
    public void setAge(int age) { 
    	this.age = age; 
    	}

    public String getGender() {
    	return gender;
    	}
    public void setGender(String gender) { 
    	this.gender = gender; 
    	}

    public String getPhone() { 
    	return phone; 
    	}
    public void setPhone(String phone) {
    	this.phone = phone; 
    	}

    public String getEmail() {
    	return email; 
    	}
    public void setEmail(String email) {
    	this.email = email;
    	}

    public String getAddress() { 
    	return address; 
    	}
    public void setAddress(String address) { 
    	this.address = address;
    	}
    
    
    
    
    
}








