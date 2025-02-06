package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_SameVersion {

    @Test
    public void compareTo_SameVersion() {
        AppVersion appVersion1 = new AppVersion("1.0.0");
        AppVersion appVersion2 = new AppVersion("1.0.0");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}