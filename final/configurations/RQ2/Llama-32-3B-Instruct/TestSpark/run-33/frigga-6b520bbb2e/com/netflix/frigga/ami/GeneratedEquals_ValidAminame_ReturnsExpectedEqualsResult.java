package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_ValidAminame_ReturnsExpectedEqualsResult {

    @Test
    public void equals_ValidAminame_ReturnsExpectedEqualsResult() {
        AppVersion appVersion = new AppVersion("0.9.1-EC2-X86_64-GP2");
        boolean expectedEqualsResult = true;
        assertTrue(appVersion.equals(new AppVersion("0.9.1-EC2-X86_64-GP2")));
    }

}