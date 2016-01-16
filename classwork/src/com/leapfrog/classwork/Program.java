/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.classwork;

import com.leapfrog.classwork.dao.CourseDAO;
import com.leapfrog.classwork.dao.impl.CourseDAOImpl;
import com.leapfrog.classwork.view.CourseView;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Atman
 */
public class Program {

    private static void menu() {
        System.out.println("Welcome to Leapfrog Academy");
        System.out.println("1. Courses");
        System.out.println("2. Mentors");
        System.out.println("3. Students");
        System.out.println("4. Exit");
        System.out.println("Enter your Choice[1-4]:");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CourseDAO courseDAO = new CourseDAOImpl(new ArrayList<>());
        
        while (true) {
            menu();
            switch (input.nextInt()) {
                case 1:
                    CourseView cv = new CourseView(input, courseDAO);
                    cv.controller();
                    break;
                case 2:
                    //MentorView
                    break;
                case 3:
                    //StudentView
                    
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }

    }

    
}
