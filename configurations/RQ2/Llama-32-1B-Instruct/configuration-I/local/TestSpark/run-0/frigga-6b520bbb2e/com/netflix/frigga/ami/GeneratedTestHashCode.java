package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestHashCode {

    @Test
    public void testHashCode() {
        // Arrange
        String expected = "package 1.0";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName = new AppVersion();
        parseName.setPackage("expected");
        parseName.Version("expected");

        System.out.println(parseName.hashCode());
    }

}