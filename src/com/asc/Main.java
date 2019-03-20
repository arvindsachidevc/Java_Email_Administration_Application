package com.asc;

/**
 * # -*- coding: utf-8 -*-
 * Created On:             14 Mar 2019 at 6:50 PM
 * Author:                 Arvind Sachidev Chilkoor
 * Created Using:          IntelliJ IDEA
 * Name of Project:        Email_Administration_Application
 * Package Name:           com.asc
 *
 *
 * Description:
 * Class Main
 *
 * */

public class Main {

    public static void main(String[] args) {
	// Creating the objects here
        Email eml1 = new Email("John", "Oliver");

        eml1.setAltemailid("jo@gmail.com");
        System.out.println("Alternate Email has been set to: "+ eml1.getAltemailid());

        System.out.println("\n\n"+eml1.showinfo());


    }
}
