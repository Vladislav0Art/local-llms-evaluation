package com.netflix.frigga.ami;

public class GeneratedParseName_[EmptyString]

Test {


    private AppVersion appVersion;
    private String amiName;

    @Test
    public void parseName_[ EmptyString]Test() {
        amiName = "";
        appVersion = AppVersion.parseName(amiName);
        assert null == appVersion;
    }

}