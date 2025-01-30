package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedEqualsDifferentPackageNamesTest {

    @Test
    public void equalsDifferentPackageNamesTest() {
        String amiName1 = "subscriberha-1.0.0-h586499";
        AppVersion appVersion1 = AppVersion.parseName(amiName1);
        String amiName2 = "subscriberhb-1.0.0-h586499";
        AppVersion appVersion2 = AppVersion.parseName(amiName2);

        assertFalse(appVersion1.equals(appVersion2));
    }

}