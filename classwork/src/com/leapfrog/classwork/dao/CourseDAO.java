/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.classwork.dao;

import com.leapfrog.classwork.entity.Course;
import java.util.List;

/**
 *
 * @author Atman
 */
public interface CourseDAO {
    int insert(Course s);
    int update(Course s);
    int delete(int id);
    Course getById(int id);
    List<Course> getAll();
}
