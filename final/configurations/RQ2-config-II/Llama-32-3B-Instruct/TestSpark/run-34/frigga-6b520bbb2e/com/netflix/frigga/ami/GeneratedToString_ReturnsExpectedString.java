package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedToString_ReturnsExpectedString {

    @Test
    public void toString_ReturnsExpectedString() {
        String amiName = "1.0.0-123456";
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion(amiName);
        assertNotNull(appVersion.toString());
    }

}