package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareSameVersion {

    @Test
    public void compareSameVersion() {
        AppVersion appVersion1 = AppVersion.parseName("amarth-1234567890");
        AppVersion appVersion2 = AppVersion.parseName("amarth-1234567890");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}