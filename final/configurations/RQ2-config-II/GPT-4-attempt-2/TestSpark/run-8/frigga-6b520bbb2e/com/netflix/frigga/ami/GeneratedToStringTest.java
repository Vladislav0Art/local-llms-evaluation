package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("myAmiName-mine-1-h123");
        assertEquals("AppVersion{myAmiName-mine-1-h123}", appVersion.toString());
    }

}