package com.netflix.frigga.ami;

public class Generated[MethodUnderTest]

HashCodeTest {


    private AppVersion appVersion;

    public void setAppVersion (AppVersion appVersion){
        this.appVersion = appVersion;
    }

    @Test
    public void [MethodUnderTest]HashCodeTest() {
        String output = "[AppVersion] name= test-ami-name, package= test-package, version=1.0.0, build-job-name= test-build-job-name, build-number= build-number, commit= test-commit, changelist= test-changelist";
        int expectedHashCode = 1234567890;
        int actualHashCode = appVersion.hashCode();
        assertEquals(expectedHashCode, actualHashCode);
    }

}