package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTest_getBuildNumber {

    @Test
    public void test_getBuildNumber() {
        AppVersion appVersion = new AppVersion();
        String buildNumber = appVersion.getBuildNumber();
        assertEquals("1", buildNumber);
    }

}