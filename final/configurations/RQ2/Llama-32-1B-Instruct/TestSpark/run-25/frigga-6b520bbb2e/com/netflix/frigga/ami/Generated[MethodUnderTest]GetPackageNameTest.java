package com.netflix.frigga.ami;

public class Generated[MethodUnderTest]

GetPackageNameTest {


    private AppVersion appVersion;

    public void setAppVersion (AppVersion appVersion){
        this.appVersion = appVersion;
    }

    @Test
    public void [MethodUnderTest]GetPackageNameTest() {
        String packageName = "test-package";
        String expectedOutput = packageName;
        String actualOutput = appVersion gettingName();
        assertEquals(expectedOutput, actualOutput);
    }

}