/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.classwork.dao;

import com.leapfrog.classwork.entity.Student;
import java.util.List;

/**
 *
 * @author Atman
 */
public interface StudentDAO {
    void insert(Student s);
    void update(Student s);
    void delete(int id);
    Student getById(int id);
    List<Student> getAll();
}
