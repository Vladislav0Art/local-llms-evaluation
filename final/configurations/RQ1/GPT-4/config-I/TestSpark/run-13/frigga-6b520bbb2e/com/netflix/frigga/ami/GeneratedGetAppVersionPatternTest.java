package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        assertEquals(AppVersion.APP_VERSION_PATTERN, AppVersion.getAppVersionPattern());
    }

}