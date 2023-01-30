package com.cc.java;

import java.text.SimpleDateFormat;
// import java.time.LocalTime; //für System.out.println(LocalTime.now());

import java.util.Date;
// import java.time.format.DateTimeFormatter;
public class AppExt {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    //    System.out.println("12:55, Mittag!");
    //    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        // System.out.println(LocalTime.now());//+dtf.format(LocalDateTime.now()));
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStamp = date.format(new Date());
        System.out.println("Current Time Stamp " +timeStamp);
}

    
}


