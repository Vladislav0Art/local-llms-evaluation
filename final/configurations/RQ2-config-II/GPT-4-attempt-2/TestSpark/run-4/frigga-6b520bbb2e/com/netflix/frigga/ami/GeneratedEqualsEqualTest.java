package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsEqualTest {

    @Test
    public void equalsEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("ami-App1-v1.0");
        AppVersion appVersion2 = AppVersion.parseName("ami-App1-v1.0");
        assertTrue(appVersion1.equals(appVersion2));
    }

}