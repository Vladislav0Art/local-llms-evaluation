package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        // Arrange
        String expected = "package 1.0";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName1 = new AppVersion();
        parseName1.setPackage("expected");
        parseName1.Version("expected");

        AppVersion parseName2 = new AppVersion();
        parseName2.setPackage("expected");
        parseName2.Version("expected");

        System.out.println(parseName1.equals(parseName2));
    }

}