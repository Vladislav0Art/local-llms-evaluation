package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestParseName_NameIsNotEmpty {

    @Test
    public void testParseName_NameIsNotEmpty() {
        String amiName = "Example_AMI";
        appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals(NameConstants.AMI_NAME, appVersion.getPackageName());
    }

}