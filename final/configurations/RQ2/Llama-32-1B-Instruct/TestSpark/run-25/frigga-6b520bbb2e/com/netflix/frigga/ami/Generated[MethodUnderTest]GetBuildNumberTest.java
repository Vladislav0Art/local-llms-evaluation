package com.netflix.frigga.ami;

public class Generated[MethodUnderTest]

GetBuildNumberTest {


    private AppVersion appVersion;

    public void setAppVersion (AppVersion appVersion){
        this.appVersion = appVersion;
    }

    @Test
    public void [MethodUnderTest]GetBuildNumberTest() {
        int buildNumber = 1234567890;
        String expectedOutput = "build-number";
        String actualOutput = appVersion.getBuildNumber();
        assertEquals(expectedOutput, actualOutput);
    }

}