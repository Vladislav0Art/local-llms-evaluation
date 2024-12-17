package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPackageName {

    @Test
    public void testGetPackageName() {
        // Arrange
        String expected = "package";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName = new AppVersion();
        parseName.setPackageName("expected");

        System.out.println(parseName.getPackageName());
    }

}