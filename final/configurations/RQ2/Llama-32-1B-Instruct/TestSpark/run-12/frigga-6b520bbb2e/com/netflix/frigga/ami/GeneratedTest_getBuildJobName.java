package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTest_getBuildJobName {

    @Test
    public void test_getBuildJobName() {
        AppVersion appVersion = new AppVersion();
        String expectedAmzn = "ami-abc123";
        assertEquals(NameConstants.AMI_BUILD_JOB_NAME.toLowerCase(), appVersion.getBuildJobName());
    }

}