package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsSameObjectTest {

    @Test
    public void equalsSameObjectTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.150/WE-WAPP-subscriberha/150");
        assertTrue(appVersion.equals(appVersion));
    }

}