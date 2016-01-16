/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.classwork.dao;

import com.leapfrog.classwork.entity.Mentor;
import java.util.List;

/**
 *
 * @author Atman
 */
public interface MentorDAO {
    void insert(Mentor s);
    void update(Mentor s);
    void delete(int id);
    Mentor getById(int id);
    List<Mentor> getAll();
}
    

