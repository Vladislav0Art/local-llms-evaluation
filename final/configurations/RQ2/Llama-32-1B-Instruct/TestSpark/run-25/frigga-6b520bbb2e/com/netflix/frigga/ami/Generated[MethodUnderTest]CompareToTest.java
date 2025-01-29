package com.netflix.frigga.ami;

public class Generated[MethodUnderTest]

CompareToTest {


    private AppVersion appVersion;

    public void setAppVersion (AppVersion appVersion){
        this.appVersion = appVersion;
    }

    @Test
    public void [MethodUnderTest]CompareToTest() {
        AppVersion otherAppVersion = new AppVersion();
        int expectedResult = 0;
        int actualResult = appVersion.compareTo(otherAppVersion);
        assertEquals(expectedResult, actualResult);
    }

}