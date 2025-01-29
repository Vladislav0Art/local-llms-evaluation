package com.netflix.frigga.ami;

public class Generated[MethodUnderTest]

GetCommitTest {


    private AppVersion appVersion;

    public void setAppVersion (AppVersion appVersion){
        this.appVersion = appVersion;
    }

    @Test
    public void [MethodUnderTest]GetCommitTest() {
        String commit = "test-commit";
        String expectedOutput = commit;
        String actualOutput = appVersion.getCommit();
        assertEquals(expectedOutput, actualOutput);
    }

}