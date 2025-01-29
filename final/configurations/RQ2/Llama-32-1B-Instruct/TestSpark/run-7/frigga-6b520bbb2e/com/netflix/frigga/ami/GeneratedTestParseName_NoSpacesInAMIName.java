package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestParseName_NoSpacesInAMIName {

    @Test
    public void testParseName_NoSpacesInAMIName() {
        String amiName = "Example-AMI";
        appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals(NameConstants.AMI_NAME, appVersion.getPackageName());
    }

}