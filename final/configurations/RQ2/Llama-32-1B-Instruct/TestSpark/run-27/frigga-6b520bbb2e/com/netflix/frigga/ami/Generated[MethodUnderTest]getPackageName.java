package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import com.netflix.frigga.AppVersionTestUtils;
import org.junit.Test;

public class Generated[MethodUnderTest]

getPackageName {

    @Test
    public void [MethodUnderTest]getPackageName() {
        String amiName = "ami-name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertEquals("Package name", appVersion.getPackageName(), NameConstants.AMI_PACKAGE_NAME);
    }

}