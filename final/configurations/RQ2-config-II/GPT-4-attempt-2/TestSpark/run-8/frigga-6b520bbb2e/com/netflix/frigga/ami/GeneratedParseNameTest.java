package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = AppVersion.parseName("myAmiName-mine-1-h123");
        assertEquals("myAmiName", appVersion.getPackageName());
        assertEquals("mine-1-h123", appVersion.getVersion());
    }

}