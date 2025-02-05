package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("com.netflix.frigga.ami.AppVersion-testversion");
        AppVersion appVersion2 = AppVersion.parseName("com.netflix.frigga.ami.AppVersion-testversion");
        assertTrue(appVersion1.equals(appVersion2));
    }

}