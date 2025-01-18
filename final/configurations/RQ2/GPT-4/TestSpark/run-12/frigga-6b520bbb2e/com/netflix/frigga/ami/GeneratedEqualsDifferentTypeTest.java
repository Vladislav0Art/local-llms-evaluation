package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentTypeTest {

    @Test
    public void equalsDifferentTypeTest() {
        AppVersion appVersion = AppVersion.parseName("appName-version-buildJob-buildNumber-commit");
        assertFalse(appVersion.equals("NotAppVersionObject"));
    }

}