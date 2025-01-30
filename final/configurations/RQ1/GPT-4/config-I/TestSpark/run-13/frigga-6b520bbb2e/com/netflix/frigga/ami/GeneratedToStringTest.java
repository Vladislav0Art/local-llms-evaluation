package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion validAppVersion = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        String expectedToStringOutput = "AppVersion [packageName=subscriberha, version=1.0.0, buildJobName=WE-WAPP-subscriberha, buildNumber=150, changelist=null]";
        assertEquals(expectedToStringOutput, validAppVersion.toString());
    }

}