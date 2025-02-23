package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCompareTo {

    private static final Pattern APP_VERSION_PATTERN = Pattern.compile(
            "([" + NameConstants.NAME_HYPHEN_CHARS
                    + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");

    @Test
    public void testCompareTo() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.packageName = "app";
        appVersion1.version = "1.0.0";
        appVersion1.buildNumber = "586499";

        AppVersion appVersion2 = new AppVersion();
        appVersion2.packageName = "app";
        appVersion2.version = "1.0.0";
        appVersion2.buildNumber = "586499";

        int comparison = appVersion1.compareTo(appVersion2);
        assertEquals(0, comparison);
    }

}