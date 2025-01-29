package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[MethodUnderTest]

GetVersion_ParsedString_ReturnsParsedString {

    @Test
    public void [MethodUnderTest]GetVersion_ParsedString_ReturnsParsedString() {
        String amiName = "ami-12345678";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("12345678", appVersion.getVersion());
    }

}