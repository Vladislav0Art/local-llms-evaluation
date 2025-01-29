package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        AppVersion appVersion = new AppVersion();
        String expectedString = "ami-name";
        assertEquals(expectedString, appVersion.toString());
    }

}