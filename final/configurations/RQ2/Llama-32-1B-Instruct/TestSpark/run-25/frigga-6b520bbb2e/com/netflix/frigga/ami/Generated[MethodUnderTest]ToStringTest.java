package com.netflix.frigga.ami;

public class Generated[MethodUnderTest]

ToStringTest {


    private AppVersion appVersion;

    public void setAppVersion (AppVersion appVersion){
        this.appVersion = appVersion;
    }

    @Test
    public void [MethodUnderTest]ToStringTest() {
        String output = "[AppVersion] name= test-ami-name, package= test-package, version=1.0.0, build-job-name= test-build-job-name, build-number= build-number, commit= test-commit, changelist= test-changelist";
        String expectedOutput = "[AppVersion] name= test-ami-name, package= test-package, version=1.0.0, build-job-name= test-build-job-name, build-number= build-number, commit= test-commit, changelist= test-changelist";
        String actualOutput = appVersion.toString();
        assertEquals(expectedOutput, actualOutput);
    }

}