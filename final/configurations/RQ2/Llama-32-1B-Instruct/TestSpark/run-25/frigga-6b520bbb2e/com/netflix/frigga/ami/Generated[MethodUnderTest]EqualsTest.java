package com.netflix.frigga.ami;

public class Generated[MethodUnderTest]

EqualsTest {


    private AppVersion appVersion;

    public void setAppVersion (AppVersion appVersion){
        this.appVersion = appVersion;
    }

    @Test
    public void [MethodUnderTest]EqualsTest() {
        AppVersion otherAppVersion = new AppVersion();
        boolean result = appVersion.equals(otherAppVersion);
        assertTrue(result);
    }

}