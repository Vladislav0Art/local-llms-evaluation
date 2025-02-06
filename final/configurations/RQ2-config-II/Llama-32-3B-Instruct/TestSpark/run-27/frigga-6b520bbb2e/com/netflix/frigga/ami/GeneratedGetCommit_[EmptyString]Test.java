package com.netflix.frigga.ami;

public class GeneratedGetCommit_[EmptyString]

Test {


    private AppVersion appVersion;
    private String amiName;

    @Test
    public void getCommit_[ EmptyString]Test() {
        amiName = "";
        appVersion = AppVersion.parseName(amiName);
        assert null == appVersion.getCommit();
    }

}