package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        String appName = "equals1";
        AppVersion appVersion1 = AppVersion.parseName(appName);
        AppVersion appVersion2 = AppVersion.parseName(appName);
        // Two AppVersions with same name should be equal
        assertTrue(appVersion1.equals(appVersion2));
    }

}