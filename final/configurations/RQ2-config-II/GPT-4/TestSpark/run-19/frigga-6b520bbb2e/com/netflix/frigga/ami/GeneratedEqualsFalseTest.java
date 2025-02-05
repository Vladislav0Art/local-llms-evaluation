package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsFalseTest {

    @Test
    public void equalsFalseTest() {
        AppVersion appVersion1 = AppVersion.parseName("com.netflix.frigga.ami.AppVersion-testversion");
        AppVersion appVersion2 = AppVersion.parseName("com.netflix.frigga.ami.AppVersion-differentversion");
        assertFalse(appVersion1.equals(appVersion2));
    }

}