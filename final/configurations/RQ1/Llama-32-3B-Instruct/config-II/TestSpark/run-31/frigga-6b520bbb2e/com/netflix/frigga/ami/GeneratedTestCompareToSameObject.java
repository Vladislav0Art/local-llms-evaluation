package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestCompareToSameObject {

    @Test
    public void testCompareToSameObject() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setPackageName("subscriberha");
        appVersion1.setVersion("1.0.0-586499");
        int comparison = appVersion1.compareTo(appVersion1);
        assertEquals(0, comparison);
    }

}