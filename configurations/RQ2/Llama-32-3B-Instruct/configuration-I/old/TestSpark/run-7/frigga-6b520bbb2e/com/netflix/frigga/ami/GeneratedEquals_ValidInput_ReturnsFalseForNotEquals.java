package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedEquals_ValidInput_ReturnsFalseForNotEquals {

    @Test
    public void equals_ValidInput_ReturnsFalseForNotEquals() {
        String amiName1 = "ami-name:1.0-rc2";
        String amiName2 = "ami-name:1.0-rc3";
        assertFalse(new AppVersion(amiName1).equals(new AppVersion(amiName2)));
    }

}