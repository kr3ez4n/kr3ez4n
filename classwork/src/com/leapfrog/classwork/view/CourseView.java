/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.classwork.view;

import com.leapfrog.classwork.dao.CourseDAO;
import com.leapfrog.classwork.entity.Course;
import java.util.Scanner;

/**
 *
 * @author Atman
 */
public class CourseView {

    private Scanner input;
    private CourseDAO courseDAO;

    public CourseView(Scanner input, CourseDAO courseDAO) {
        this.input = input;
        this.courseDAO = courseDAO;
    }

    private void menu() {
        System.out.println("Course Information");
        System.out.println("1. Add Course");
        System.out.println("2. Show All Courses");
        System.out.println("3. Back");
        System.out.println("Enter your Choice[1-3]:");
    }

    private void addScreen() {
        while(true){
        Course c=new Course();
        System.out.println("Enter Course Id");
        c.setId(input.nextInt());
        System.out.println("Enter Course Name:");
        c.setName(input.next());
        System.out.println("Enter Course Description");
        c.setDescription(input.nextLine());
        
        courseDAO.insert(c);
            System.out.println("Do you want to continue[Y/N]:");
            if(input.next().equalsIgnoreCase("n")){
                break;
            }
        }
        
    }

    private void showAllScreen() {
        System.out.println("Listing all courses");
        courseDAO.getAll().forEach(c->{
            System.out.println(c.toString());
        });
    }

    public void controller() {
        boolean back=false;
        while (true) {
            menu();
            switch (input.nextInt()) {
                case 1:
                    addScreen();
                    break;
                case 2:
                    showAllScreen();
                    break;
                case 3:
                    back=true;
                    break;
            }
            
            if(back){
                break;
            }
        }
    }

}
