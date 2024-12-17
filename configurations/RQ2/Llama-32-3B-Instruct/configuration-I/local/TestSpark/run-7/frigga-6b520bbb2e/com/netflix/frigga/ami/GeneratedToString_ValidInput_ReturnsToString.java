package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedToString_ValidInput_ReturnsToString {

    @Test
    public void toString_ValidInput_ReturnsToString() {
        String amiName = "ami-name:1.0-rc2";
        String expectedString = "ami-name: 1.0-rc2";
        assertEquals(expectedString, new AppVersion(amiName).toString());
    }

}