/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.classwork.dao.impl;

import com.leapfrog.classwork.dao.MentorDAO;

import com.leapfrog.classwork.entity.Mentor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Atman
 */
public class MentorDAOimpl implements MentorDAO {
private final List<Mentor>mentorList;
    public MentorDAOimpl() {
    mentorList=new ArrayList<>();
    }
    

    @Override
    public void insert(Mentor s) {
         mentorList.add(s);
    }

    @Override
    public void update(Mentor s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mentor getById(int id) {
for(Mentor s: mentorList){
            if(s.getId()==id){
            }            return s;    }
return null;
    }
    @Override
    public List<Mentor> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    

        

