package com.netflix.frigga.ami;

public class Generated[MethodUnderTest]

GetChangelistTest {


    private AppVersion appVersion;

    public void setAppVersion (AppVersion appVersion){
        this.appVersion = appVersion;
    }

    @Test
    public void [MethodUnderTest]GetChangelistTest() {
        String changelist = "test-changelist";
        String expectedOutput = changelist;
        String actualOutput = appVersion.getChangelist();
        assertEquals(expectedOutput, actualOutput);
    }

}