package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareDifferentVersions {

    @Test
    public void compareDifferentVersions() {
        AppVersion appVersion1 = AppVersion.parseName("amarth-1234567890");
        AppVersion appVersion2 = AppVersion.parseName("amarth-9876543210");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}