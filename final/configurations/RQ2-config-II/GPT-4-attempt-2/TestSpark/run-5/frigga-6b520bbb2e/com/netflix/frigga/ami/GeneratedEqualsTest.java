package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        AppVersion appVersion2 = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        assertTrue(appVersion1.equals(appVersion2));
    }

}