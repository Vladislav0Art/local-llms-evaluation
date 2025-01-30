package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameReturnsCorrectOnMatchedInputTest {

    @Test
    public void parseNameReturnsCorrectOnMatchedInputTest() {
        String input = "myPackage-1.2.3-586499.h150/WE-WAPP-myPackage/150";
        AppVersion result = AppVersion.parseName(input);
        assertNotNull(result);
        assertEquals("myPackage", result.getPackageName());
        assertEquals("1.2.3", result.getVersion());
        assertEquals("586499", result.getBuildNumber());
        assertEquals("h150", result.getCommit());
        assertEquals("WE-WAPP-myPackage", result.getBuildJobName());
    }

}