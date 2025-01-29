package com.netflix.frigga.ami;

public class Generated[MethodUnderTest]

ParseNameTest {


    private AppVersion appVersion;

    public void setAppVersion (AppVersion appVersion){
        this.appVersion = appVersion;
    }

    @Test
    public void [MethodUnderTest]ParseNameTest() {
        String expectedOutput = "test-ami-name";
        String actualOutput = appVersion.parseName("test-ami-name");
        assertEquals(expectedOutput, actualOutput);
    }

}