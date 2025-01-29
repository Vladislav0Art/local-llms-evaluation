package com.netflix.frigga.ami;

public class Generated[MethodUnderTest]

GetVersionTest {


    private AppVersion appVersion;

    public void setAppVersion (AppVersion appVersion){
        this.appVersion = appVersion;
    }

    @Test
    public void [MethodUnderTest]GetVersionTest() {
        String version = "1.0.0";
        String expectedOutput = version;
        String actualOutput = appVersion.getVersion();
        assertEquals(expectedOutput, actualOutput);
    }

}