package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersion = AppVersion.parseName("testApp-1.0.0-h123/A-Test-App/123");
        AppVersion other = AppVersion.parseName("testApp-1.0.0-h456/B-Test-App/456");

        assertTrue(appVersion.equals(appVersion));
        assertFalse(appVersion.equals(other));
        assertFalse(appVersion.equals(null));
        assertFalse(appVersion.equals(new Object()));
    }

}