/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author shahzad
 */
public class DateFormatter {

    public static void main(String[] args) {

        getDate("dd/MM/yyyy");
        getDate("yyyy/MM/dd");
        getDate("MMM-dd-yyyy");
        getDate("MMMM dd yyyy");
		//getDate(new String[] {"dd/MM/yyyy", "yyyy/MM/dd", "MMM-dd-yyyy", "MMMM dd yyyy"}, "dd-MMM-yyyy");
    }

    private static void getDate(String dateFormat) {
        Scanner sc = new Scanner(System.in);
        DateFormat dFormat;
        DateFormat dOutFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date cDate = new Date();
        String uDate = "";
        try {
            dFormat = new SimpleDateFormat(dateFormat);
            System.out.printf("Enter Date (%s): ", dateFormat);
            uDate = sc.nextLine();
            cDate = dFormat.parse(uDate);
            System.out.println("The entered date is: " + dOutFormat.format(cDate));
        } catch (Exception e) {
            System.err.println("Incorrect date");
        } finally {
            //sc.close();
        }
    }

    private static void getDate(String[] inputDateFormat, String outputDateFormat) {
        Scanner sc = new Scanner(System.in);

        DateFormat dFormat;
        DateFormat dOutFormat = new SimpleDateFormat(outputDateFormat);
        Date cDate = new Date();
        String uDate = "";

        try {
            for (String fmtElement : inputDateFormat) {
                dFormat = new SimpleDateFormat(fmtElement);
                System.out.printf("Enter Date (%s): ", fmtElement);
                uDate = sc.nextLine();
                cDate = dFormat.parse(uDate);
                System.out.println("The entered date is: " + dOutFormat.format(cDate));
            }
        } catch (Exception e) {
            System.err.println("Incorrect date");
        } finally {
            sc.close();
        }
    }
}
