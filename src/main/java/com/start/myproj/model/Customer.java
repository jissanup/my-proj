package com.start.myproj.model;

import javax.persistence.*;

@Entity
@Table(name="CustomerTable")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "custId")
    private Integer id;

    @Column(name="CustName")
    private String name;

   public Customer(int id, String name){
        this.id= id;
        this.name=name;
    }
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

