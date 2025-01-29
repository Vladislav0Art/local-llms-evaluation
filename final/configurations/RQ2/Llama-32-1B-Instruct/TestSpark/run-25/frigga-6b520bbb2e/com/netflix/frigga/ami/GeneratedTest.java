package com.netflix.frigga.ami;

public class GeneratedTest {


    private AppVersion appVersion;

    public void setAppVersion(AppVersion appVersion) {
        this.appVersion = appVersion;
    }

    @Test
    public void [MethodUnderTest]

    ParseNameTest() {
        String expectedOutput = "test-ami-name";
        String actualOutput = appVersion.parseName("test-ami-name");
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void [MethodUnderTest]

    CompareToTest() {
        AppVersion otherAppVersion = new AppVersion();
        int expectedResult = 0;
        int actualResult = appVersion.compareTo(otherAppVersion);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void [MethodUnderTest]

    GetPackageNameTest() {
        String packageName = "test-package";
        String expectedOutput = packageName;
        String actualOutput = appVersion gettingName();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void [MethodUnderTest]

    GetVersionTest() {
        String version = "1.0.0";
        String expectedOutput = version;
        String actualOutput = appVersion.getVersion();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void [MethodUnderTest]

    GetBuildJobNameTest() {
        String buildJobName = "test-build-job-name";
        String expectedOutput = buildJobName;
        String actualOutput = appVersion.getBuildJobName();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void [MethodUnderTest]

    GetBuildNumberTest() {
        int buildNumber = 1234567890;
        String expectedOutput = "build-number";
        String actualOutput = appVersion.getBuildNumber();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void [MethodUnderTest]

    GetCommitTest() {
        String commit = "test-commit";
        String expectedOutput = commit;
        String actualOutput = appVersion.getCommit();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void [MethodUnderTest]

    GetChangelistTest() {
        String changelist = "test-changelist";
        String expectedOutput = changelist;
        String actualOutput = appVersion.getChangelist();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void [MethodUnderTest]

    ToStringTest() {
        String output = "[AppVersion] name= test-ami-name, package= test-package, version=1.0.0, build-job-name= test-build-job-name, build-number= build-number, commit= test-commit, changelist= test-changelist";
        String expectedOutput = "[AppVersion] name= test-ami-name, package= test-package, version=1.0.0, build-job-name= test-build-job-name, build-number= build-number, commit= test-commit, changelist= test-changelist";
        String actualOutput = appVersion.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void [MethodUnderTest]

    HashCodeTest() {
        String output = "[AppVersion] name= test-ami-name, package= test-package, version=1.0.0, build-job-name= test-build-job-name, build-number= build-number, commit= test-commit, changelist= test-changelist";
        int expectedHashCode = 1234567890;
        int actualHashCode = appVersion.hashCode();
        assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void [MethodUnderTest]

    EqualsTest() {
        AppVersion otherAppVersion = new AppVersion();
        boolean result = appVersion.equals(otherAppVersion);
        assertTrue(result);
    }

    @Test
    public void [MethodUnderTest]

    getAppVersionPatternTest() {
        String expectedOutput = "Pattern[APPVERSION_NAME]";
        Pattern actualPattern = appVersion.getAppVersionPattern();
        assertEquals(expectedOutput, actualPattern.toString());
    }

}