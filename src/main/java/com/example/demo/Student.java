package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long studentid;

    private String name;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Book> bookList;


}