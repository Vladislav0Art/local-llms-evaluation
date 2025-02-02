package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedGetPackageName_AmiNameNotNull_ReturnsCorrectValue {

    @Test
    public void getPackageName_AmiNameNotNull_ReturnsCorrectValue() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertEquals("subscriberha", parsedAppVersion.getPackageName());
    }

}