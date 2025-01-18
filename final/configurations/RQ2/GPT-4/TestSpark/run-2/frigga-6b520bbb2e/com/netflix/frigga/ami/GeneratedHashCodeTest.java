package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        String appName1 = "hash1";
        String appName2 = "hash2";
        AppVersion appVersion1 = AppVersion.parseName(appName1);
        AppVersion appVersion2 = AppVersion.parseName(appName2);
        // Two different AppVersions should not have the same hashcode
        assertTrue(appVersion1.hashCode() != appVersion2.hashCode());
    }

}