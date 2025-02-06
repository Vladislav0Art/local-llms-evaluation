package com.netflix.frigga.ami;

public class GeneratedGetBuildJobName_[EmptyString]

Test {


    private AppVersion appVersion;
    private String amiName;

    @Test
    public void getBuildJobName_[ EmptyString]Test() {
        amiName = "";
        appVersion = AppVersion.parseName(amiName);
        assert null == appVersion.getBuildJobName();
    }

}