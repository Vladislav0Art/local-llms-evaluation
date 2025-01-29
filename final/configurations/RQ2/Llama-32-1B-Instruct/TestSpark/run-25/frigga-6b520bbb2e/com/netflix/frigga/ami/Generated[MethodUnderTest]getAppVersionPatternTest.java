package com.netflix.frigga.ami;

public class Generated[MethodUnderTest]

getAppVersionPatternTest {


    private AppVersion appVersion;

    public void setAppVersion (AppVersion appVersion){
        this.appVersion = appVersion;
    }

    @Test
    public void [MethodUnderTest]getAppVersionPatternTest() {
        String expectedOutput = "Pattern[APPVERSION_NAME]";
        Pattern actualPattern = appVersion.getAppVersionPattern();
        assertEquals(expectedOutput, actualPattern.toString());
    }

}