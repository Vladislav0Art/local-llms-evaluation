package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedHashCode_ValidAminame_ReturnsExpectedHashcode {

    @Test
    public void hashCode_ValidAminame_ReturnsExpectedHashcode() {
        AppVersion appVersion = new AppVersion("0.9.1-EC2-X86_64-GP2");
        int expectedHashcode = 100;
        assertEquals(expectedHashcode, appVersion.hashCode());
    }

}