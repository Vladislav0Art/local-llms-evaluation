package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetChangelistTest {

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.150/WE-WAPP-subscriberha/150");
        assertEquals("150", appVersion.getChangelist());
    }

}