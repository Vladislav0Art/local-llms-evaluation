package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTest_getPackageName {

    @Test
    public void test_getPackageName() {
        AppVersion appVersion = new AppVersion();
        String expectedAmzn = "ami-abc123";
        assertEquals(NameConstants.AMI_NAME.toLowerCase(), appVersion.getPackage());
    }

}