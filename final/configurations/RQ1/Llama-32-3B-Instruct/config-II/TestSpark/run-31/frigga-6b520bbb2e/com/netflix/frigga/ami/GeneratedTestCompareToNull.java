package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestCompareToNull {

    @Test
    public void testCompareToNull() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("subscriberha");
        appVersion.setVersion("1.0.0-586499");
        int comparison = appVersion.compareTo(null);
        assertEquals(-1, comparison);
    }

}