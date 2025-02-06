package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetPackageName_ReturnsExpectedValue {

    @Test
    public void getPackageName_ReturnsExpectedValue() {
        String amiName = "1.0.0-123456";
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion(amiName);
        assertEquals(NameConstants.AMI_NAME, appVersion.getPackageName());
    }

}