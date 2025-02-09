package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsNotEqualTest {

    @Test
    public void equalsNotEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("ami-App1-v1.0");
        AppVersion appVersion2 = AppVersion.parseName("ami-App2-v2.0");
        assertFalse(appVersion1.equals(appVersion2));
    }

}