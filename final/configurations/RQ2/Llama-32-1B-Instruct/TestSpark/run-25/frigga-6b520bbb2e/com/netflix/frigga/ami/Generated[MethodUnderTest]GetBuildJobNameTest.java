package com.netflix.frigga.ami;

public class Generated[MethodUnderTest]

GetBuildJobNameTest {


    private AppVersion appVersion;

    public void setAppVersion (AppVersion appVersion){
        this.appVersion = appVersion;
    }

    @Test
    public void [MethodUnderTest]GetBuildJobNameTest() {
        String buildJobName = "test-build-job-name";
        String expectedOutput = buildJobName;
        String actualOutput = appVersion.getBuildJobName();
        assertEquals(expectedOutput, actualOutput);
    }

}