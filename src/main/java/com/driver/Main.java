package com.driver;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
        // rw.name = "changingPrivateMember";
        // System.out.println(rw.name);
        // 'name' has private access in 'com.driver.RWOnly'

        rwOnly.setName("new_name");
        String given_name = rwOnly.getName();
        System.out.println(given_name);
    }

}