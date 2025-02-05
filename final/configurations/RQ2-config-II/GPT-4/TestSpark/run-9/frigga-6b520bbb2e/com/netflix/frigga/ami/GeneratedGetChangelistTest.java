package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetChangelistTest {

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("test-ami-0.0.1-build01-g123abc-chg1234");
        assertEquals("chg1234", appVersion.getChangelist());
    }

}