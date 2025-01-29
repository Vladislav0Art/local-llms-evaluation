package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[MethodUnderTest]

GetVersion_NoMatch_ReturnsNull {

    @Test
    public void [MethodUnderTest]GetVersion_NoMatch_ReturnsNull() {
        String amiName = "ami-hello-world";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

}