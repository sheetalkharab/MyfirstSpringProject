package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long bookid;
    String name;
//    Student stu

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "studentid", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Student student;


}