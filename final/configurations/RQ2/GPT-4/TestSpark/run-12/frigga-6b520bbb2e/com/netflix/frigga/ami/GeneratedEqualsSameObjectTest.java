package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsSameObjectTest {

    @Test
    public void equalsSameObjectTest() {
        AppVersion appVersion = AppVersion.parseName("appName-version-buildJob-buildNumber-commit");
        assertTrue(appVersion.equals(appVersion));
    }

}