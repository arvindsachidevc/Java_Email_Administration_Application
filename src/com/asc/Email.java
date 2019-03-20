package com.asc;

import java.util.Scanner;

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
 *
 * The application does the following:
 * 1. Generate and email with the following syntax: firstname.lastname@department.company.com.
 * 2. Categorize and determine the departments(HR, IT, Sales/Marketing, R&D, Accounting/Legal, Production,
 * Maintenance, Procurement/Warehouse/Services), default is Blank.
 * 3. Generate a random string for password.
 * 4. Have a set-methods to change the password.
 * 5. Set the mailbox capacity.
 * 6. Define and alternate email id for lockout or exceptions.
 * 7. Have a get-methods to display the name, email and mailbox capacity.
 *
 **/
public class Email {

    // Creating the instance variables for class Email

    private String firstname;
    private String lastname;
    private String password;
    private int defaultpwdlength;
    private String department;
    private int mailboxcapacity = 5;
    private String altemailid;
    private String companysuffix = "amazingcompany.com";
    private String emailid;

    // Creating constructors instance variables for the following:
    // firstname, lastname, department, a random password, set the mailbox capacity, set the alternate email id.
    // Change the password.

    //Consructor for instance Variables creates
    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Email created for " + this.firstname +" "+this.lastname);

        //Constructor for department
        this.department = setDepartment();
        System.out.println("Department is " + this.department);

        //Constructor for generating a random password
        this.password = randomPwd(defaultpwdlength = 10);
        System.out.println("Your password is:  " + this.password);

        //Constructor for the default mailbox capacity.
        this.mailboxcapacity = mailboxcapacity;

        //Constructor for the alternate email id
        this.altemailid = altemailid;

        //To create the email ID using the firstname and lastname.
        emailid = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companysuffix;
        System.out.println("Your Email ID is :  "+ emailid);



    }

    // Method for getting the department/ Receive; input from User

    private String setDepartment(){
        // Display on Screen for getting the choice from the USER.
        System.out.print("DEPARTMENT CODES:" +
                "\n[0] for General/Common" +
                "\n[1] for Human Resources" +
                "\n[2] for Information Technology" +
                "\n[3] for Sales/Marketing" +
                "\n[4] for Research & Development" +
                "\n[5] for Accounting/Legal" +
                "\n[6] for Production" +
                "\n[7] for Maintenance" +
                "\n[8] for Procurement/Warehouse/Services" +
                "\nEnter the department code:  ");

        Scanner inputdep = new Scanner(System.in);  // Input
        int depchoice = inputdep.nextInt();         // Creating a variable for choice.

        //Switch Case for selecting the department.
        switch (depchoice){
            case 0:
                return "gen";
            case 1:
                return "hr";
            case 2:
                return "it";
            case 3:
                return "sales";
            case 4:
                return "r_d";
            case 5:
                return "acct";
            case 6:
                return "prod";
            case 7:
                return "maint";
            case 8:
                return "proc";
            default:
                return "none";
        }
    }

    // Method to generate random password.
    private String randomPwd(int pwdlength){
        String pwdset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_@#$%&abcdefghijklmnopqrstuvwxyz";
        char[] password = new char[pwdlength];
        for (int i=0; i<pwdlength; i++){
            int rand = (int)(Math.random() * pwdset.length()); // multiplying the output of math.random with pwdset length.
            password[i] = pwdset.charAt(rand); // Takes the character at location of pwdset, for which the value,
                                                // is generated previously and passes it to password.

        }
        return new String(password);
    }

    //setter to set the default mailbox capacity
    public void setMailboxcapacity(int capacity){
        this.mailboxcapacity = capacity;
    }

    //setter to set the alternate email id
    public void setAltemailid(String alt_email){
        this.altemailid = alt_email;
    }

    //setter to change the password
    public void changepwd(String password){
        this.password = password;
    }

    //getter for mailbox capacity
    public int getMailboxcapacity(){
        return mailboxcapacity;
    }

    //getter for alternate email id
    public String getAltemailid(){
        return altemailid;
    }

    //getter for change of password
    public String getPassword(){
        return password;
    }

    //Display information method
    public String showinfo(){
        return "\n\nEMPLOYEE NAME:      " + firstname+" "+lastname+
                "\nCOMPANY EMAIL ID:   " + emailid +
                "\nMAILBOX CAPACITY:   " + mailboxcapacity + " GB" +
                "\nALTERNATE EMAIL ID: " + altemailid;
    }
}
