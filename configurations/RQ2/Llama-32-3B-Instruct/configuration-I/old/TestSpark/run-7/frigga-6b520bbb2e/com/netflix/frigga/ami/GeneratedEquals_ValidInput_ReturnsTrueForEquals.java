package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedEquals_ValidInput_ReturnsTrueForEquals {

    @Test
    public void equals_ValidInput_ReturnsTrueForEquals() {
        String amiName1 = "ami-name:1.0-rc2";
        String amiName2 = "ami-name:1.0-rc2";
        assertTrue(new AppVersion(amiName1).equals(new AppVersion(amiName2)));
    }

}