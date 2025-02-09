package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_DifferentBuildNumbers_ReturnsNegativeValue {

    @Test
    public void compareTo_DifferentBuildNumbers_ReturnsNegativeValue() {
        AppVersion appVersion1 = new AppVersion("1.2.3");
        AppVersion appVersion2 = new AppVersion("4.5.6");
        int result = appVersion1.compareTo(appVersion2);
        negative(result);
    }

}