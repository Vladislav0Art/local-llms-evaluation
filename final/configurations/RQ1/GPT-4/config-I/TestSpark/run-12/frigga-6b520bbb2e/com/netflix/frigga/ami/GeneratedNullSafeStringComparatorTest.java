package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNullSafeStringComparatorTest {

    @Test
    public void nullSafeStringComparatorTest() {
        AppVersion appVersion = AppVersion.parseName("testApp-1.0.0-h123/A-Test-App/123");
        AppVersion other = AppVersion.parseName("testApp-1.0.0-h456/B-Test-App/456");

        assertNotEquals(0, appVersion.compareTo(other));
        assertEquals(0, appVersion.compareTo(appVersion));
        assertNotEquals(0, appVersion.compareTo(null));
    }

}