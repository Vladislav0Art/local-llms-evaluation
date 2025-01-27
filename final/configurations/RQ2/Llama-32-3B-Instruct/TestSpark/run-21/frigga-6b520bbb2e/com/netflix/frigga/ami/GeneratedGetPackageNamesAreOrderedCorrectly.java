package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageNamesAreOrderedCorrectly {

    @Test
    public void getPackageNamesAreOrderedCorrectly() {
        AppVersion appVersion1 = new AppVersion("1.0-1234567890");
        AppVersion appVersion2 = new AppVersion("2.0-9876543210");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}