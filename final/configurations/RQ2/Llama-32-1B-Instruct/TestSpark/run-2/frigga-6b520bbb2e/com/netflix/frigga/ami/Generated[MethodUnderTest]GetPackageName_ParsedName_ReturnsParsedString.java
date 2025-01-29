package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[MethodUnderTest]

GetPackageName_ParsedName_ReturnsParsedString {

    @Test
    public void [MethodUnderTest]GetPackageName_ParsedName_ReturnsParsedString() {
        String amiName = "ami-12345678";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(NameConstants.AMI_VERSION_NAME, appVersion.getPackageName());
    }

}