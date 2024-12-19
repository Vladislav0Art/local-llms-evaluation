package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetVersion {

    @Test
    public void testGetVersion() {
        // Arrange
        String expected = "1.0";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName = new AppVersion();
        parseName.setVersion("expected");

        System.out.println(parseName.getVersion());
    }

}