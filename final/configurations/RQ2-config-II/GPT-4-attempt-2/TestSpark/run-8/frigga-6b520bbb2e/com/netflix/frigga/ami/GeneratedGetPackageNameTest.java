package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("myAmiName-mine-1-h123");
        assertEquals("myAmiName", appVersion.getPackageName());
    }

}