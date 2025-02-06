package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetChangelist_ReturnsExpectedValue {

    @Test
    public void getChangelist_ReturnsExpectedValue() {
        String amiName = "1.0.0-123456";
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion(amiName);
        assertNotNull(appVersion.getChangelist());
        assertEquals("123456", appVersion.getChangelist());
    }

}