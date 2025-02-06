package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedGetVersion_ReturnsVersion {

    @Test
    public void getVersion_ReturnsVersion() {
        AppVersion appVersion = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertEquals("1.0", appVersion.getVersion());
    }

}