package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_ReturnsNotEqualsForDifferentAppVersionsTest {

    @Test
    public void equals_ReturnsNotEqualsForDifferentAppVersionsTest() {
        AppVersion appVersion1 = new AppVersion("0.9.2-0");
        AppVersion appVersion2 = new AppVersion("0.9.3-0");
        assertFalse(appVersion1.equals(appVersion2));
    }

}