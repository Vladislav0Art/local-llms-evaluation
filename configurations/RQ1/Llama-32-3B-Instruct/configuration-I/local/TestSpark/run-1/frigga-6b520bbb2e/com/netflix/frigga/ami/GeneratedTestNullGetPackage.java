package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestNullGetPackage {

    @Test
    public void testNullGetPackage() {
        assertEquals("", nullGetPackageName());
    }

    public static String getPackageName() {
        return "com.example";
    }

    public static String nullGetPackageName() {
        return "";
    }

}