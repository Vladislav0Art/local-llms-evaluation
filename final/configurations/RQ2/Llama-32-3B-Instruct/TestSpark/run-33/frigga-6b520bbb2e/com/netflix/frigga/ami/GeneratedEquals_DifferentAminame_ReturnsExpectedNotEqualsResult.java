package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_DifferentAminame_ReturnsExpectedNotEqualsResult {

    @Test
    public void equals_DifferentAminame_ReturnsExpectedNotEqualsResult() {
        AppVersion appVersion = new AppVersion("0.9.1-EC2-X86_64-GP2");
        boolean expectedNotEqualsResult = false;
        assertFalse(appVersion.equals(new AppVersion("0.10.0-EC2-X86_64-GP2")));
    }

}