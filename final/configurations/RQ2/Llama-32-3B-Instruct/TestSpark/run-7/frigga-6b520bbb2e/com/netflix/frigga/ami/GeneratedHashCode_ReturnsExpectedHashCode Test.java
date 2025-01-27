package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedHashCode_ReturnsExpectedHashCode Test {

    @Test
    public void hashCode_ReturnsExpectedHashCode

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        int expectedHashCode = 245;
        assertEquals(expectedHashCode, appVersion.hashCode());
    }

}