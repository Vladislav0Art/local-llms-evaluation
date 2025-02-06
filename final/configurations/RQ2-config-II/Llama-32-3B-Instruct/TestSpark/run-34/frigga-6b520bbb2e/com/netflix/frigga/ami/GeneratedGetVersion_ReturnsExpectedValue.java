package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetVersion_ReturnsExpectedValue {

    @Test
    public void getVersion_ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion("1.0.0");
        assertEquals("1.0.0", appVersion.getVersion());
    }

}