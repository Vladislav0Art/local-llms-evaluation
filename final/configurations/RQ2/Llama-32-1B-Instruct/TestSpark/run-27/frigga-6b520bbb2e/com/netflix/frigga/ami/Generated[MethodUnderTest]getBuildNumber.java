package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import com.netflix.frigga.AppVersionTestUtils;
import org.junit.Test;

public class Generated[MethodUnderTest]

getBuildNumber {

    @Test
    public void [MethodUnderTest]getBuildNumber() {
        String[] buildNumbers1 = {"build-number-1", "build-number-2"};
        String[] buildNumbers2 = {"build-number-3", "build-number-4"};

        AppVersion appVersion1 = AppVersion.parseName("ami-name");
        AppVersion appVersion2 = AppVersion.parseName("ami-package-name");

        Assert.assertEquals("Build number 1", appVersion1.getBuildNumber(), BuildNumber.BUILD_NUMBER_1);
        Assert.assertEquals("Build number 3", appVersion2.getBuildNumber(), BuildNumber.BUILD_NUMBER_3);

        Result result3 = AppVersion.parseName("ami-package-name");
        String expectedBuildNumber = BuildNumber.BUILD_NUMBER_2;
        Assert.assertEquals(expectedBuildNumber, result3.getBuildNumber());
    }

}