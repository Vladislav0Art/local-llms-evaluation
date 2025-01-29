package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        // Create an instance of AppVersion directly without calling the constructor
        String amiName = "ami-name";
        AppVersion appVersion = new AppVersion();
        try {
            appVersion.parseName(amiName);
        } catch (Exception e) {
            fail("Expected exception for invalid name: " + e.getMessage());
        }
    }

}