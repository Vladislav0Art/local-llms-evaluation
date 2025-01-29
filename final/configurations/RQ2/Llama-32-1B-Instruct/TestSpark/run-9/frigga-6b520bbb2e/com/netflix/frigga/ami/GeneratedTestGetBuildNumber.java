package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetBuildNumber {

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = new AppVersion();
        String buildNumber = appVersion.getBuildNumber();
        assertTrue(buildNumber.matches(NameConstants.AMI_BUILD_NUMBER_PATTERN));
        assertEquals(123, Integer.parseInt(buildNumber));
    }

}