package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_DifferentBuildNumber_ReturnsPositiveValue {

    @Test
    public void compareTo_DifferentBuildNumber_ReturnsPositiveValue() {
        AppVersion appVersion1 = new AppVersion("com.netflix.frigga.ami:1.2.3");
        AppVersion appVersion2 = new AppVersion("com.netflix.frigga.ami:1.2.4");
        assertTrue(appVersion1.compareTo(appVersion2) > 0);
    }

}