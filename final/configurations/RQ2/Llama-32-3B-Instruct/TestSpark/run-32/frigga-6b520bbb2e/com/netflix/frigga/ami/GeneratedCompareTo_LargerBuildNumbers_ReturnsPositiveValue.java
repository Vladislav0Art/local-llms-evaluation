package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_LargerBuildNumbers_ReturnsPositiveValue {

    @Test
    public void compareTo_LargerBuildNumbers_ReturnsPositiveValue() {
        AppVersion appVersion1 = new AppVersion("1.2.3");
        AppVersion appVersion2 = new AppVersion("0.9.8");
        int result = appVersion1.compareTo(appVersion2);
        positive(result);
    }

}