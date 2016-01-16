/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.classwork.dao.impl;


import com.leapfrog.classwork.dao.StudentDAO;
import com.leapfrog.classwork.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Atman
 */
public class StudentDAOImpl implements StudentDAO {
private final List<Student> studentList;
    public StudentDAOImpl() {
       studentList=new ArrayList<>();
    }
    

    @Override
    public void insert(Student s) {
   studentList.add(s); 
    }

    @Override
    public void update(Student s) {
   }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getById(int id) {
        for(Student s: studentList){
            if(s.getId()==id){
            }            return s;
    }
   return null; 
   }
    @Override
     public List<Student> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }

