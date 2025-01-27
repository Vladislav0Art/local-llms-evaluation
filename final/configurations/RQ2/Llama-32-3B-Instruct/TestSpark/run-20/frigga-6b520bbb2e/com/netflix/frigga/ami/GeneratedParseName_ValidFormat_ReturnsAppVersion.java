package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseName_ValidFormat_ReturnsAppVersion {

    @Test
    public void parseName_ValidFormat_ReturnsAppVersion() {
        String amiName = "1.0-2012021501234-alias-amzn2-ami-hvm-x86-64-gp2";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("1.0", appVersion.getVersion());
    }

}