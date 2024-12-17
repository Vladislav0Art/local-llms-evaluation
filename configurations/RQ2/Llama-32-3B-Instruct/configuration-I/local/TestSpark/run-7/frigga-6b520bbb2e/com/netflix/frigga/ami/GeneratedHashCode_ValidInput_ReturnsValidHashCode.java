package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedHashCode_ValidInput_ReturnsValidHashCode {

    @Test
    public void hashCode_ValidInput_ReturnsValidHashCode() {
        String amiName = "ami-name:1.0-rc2";
        int expectedHashcode = new AppVersion(amiName).hashCode();
        assertEquals(expectedHashcode, new AppVersion(amiName).hashCode());
    }

}