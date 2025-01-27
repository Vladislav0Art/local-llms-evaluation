package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedHashCode_ValidHashcode {

    @Test
    public void hashCode_ValidHashcode() {
        String amiName = "ami-123456789012345678901234567890";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(-127511111, appVersion.hashCode());
    }

}