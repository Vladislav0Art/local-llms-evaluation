package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentClassNameTest {

    @Test
    public void equalsDifferentClassNameTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.150/WE-WAPP-subscriberha/150");
        assertFalse(appVersion.equals(new String("subscriberha-1.0.0-h586499.150/WE-WAPP-subscriberha/150")));
    }

}