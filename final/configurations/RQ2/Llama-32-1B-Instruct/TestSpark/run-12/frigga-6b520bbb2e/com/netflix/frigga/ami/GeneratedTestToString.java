package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        AppVersion appVersion = new AppVersion();
        String expectedAmzn = "ami-abc123";
        assertEquals(NameConstants.AMI_NAME + "-" + NameConstants.AMI_BUILD_JOB_NAME + "-" + NameConstants.AMI_BUILD_NUMBER + "-" + NameConstants.AMI_COMMIT, appVersion.toString());
    }

}