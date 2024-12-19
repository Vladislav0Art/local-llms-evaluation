package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestParseName_SucceedsWhenValidString {

    @Test
    public void testParseName_SucceedsWhenValidString() {
        // Arrange
        String expected = "1234567890abcdef";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName = new AppVersion();
        parseName.setPackageName("package");
        parseName.Version("1.0");

        System.out.println(parseName.toString());
    }

}