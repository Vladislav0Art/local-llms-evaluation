package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import com.netflix.frigga.AppVersionTestUtils;
import org.junit.Test;

public class Generated[MethodUnderTest]

parseName {

    @Test
    public void [MethodUnderTest]parseName() {
        String amiName = "ami-name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertTrue("Name not found", !appVersion.getName().isEmpty());
    }

}