package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void parseName_ExistingAmiNameIsValid() {
        AppVersion appVersion = AppVersion.parseName("ami-1234567890");
        assertNotNull(appVersion);
    }

    @Test
    public void parseName_InvalidFormat_throwsException() {
        try {
            AppVersion.parseName("invalid-format");
            fail("Expected exception was not thrown.");
        } catch (Exception e) {
            // Expected
        }
    }

    @Test
    public void parseName_EmptyString_throwsException() {
        try {
            AppVersion.parseName("");
            fail("Expected exception was not thrown.");
        } catch (Exception e) {
            // Expected
        }
    }

    @Test
    public void compareTo_SameAppVersionReturnsZero() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(0, result);
    }

    @Test
    public void compareTo_DifferentBuildNumbersReturnsPositiveInt() {
        AppVersion appVersion1 = new AppVersion("build1", "version1");
        AppVersion appVersion2 = new AppVersion("build2", "version2");
        int result = appVersion1.compareTo(appVersion2);
        assertTrue(result > 0);
    }

    @Test
    public void getAppVersionPattern_ContainsAppVersionRegex() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern != null);
        assertTrue(pattern.matcher("ami-1234567890").find());
    }

    @Test
    public void getPackageName_ReturnsExpectedName() {
        String packageName = AppVersion.getPackageName();
        assertNotNull(packageName);
        assertEquals(NameConstants.APP_VERSION_PACKAGE_NAME, packageName);
    }

    @Test
    public void getVersion_ReturnsExpectedVersion() {
        String version = AppVersion.getVersion();
        assertNotNull(version);
        assertTrue(version.matches("\\d+\\.\\d+"));
    }

    @Test
    public void getBuildJobName_ReturnsExpectedJobName() {
        String buildJobName = AppVersion.getBuildJobName();
        assertNotNull(buildJobName);
        assertTrue(buildJobName.length() > 0);
    }

    @Test
    public void getBuildNumber_ReturnsExpectedBuildNumber() {
        String buildNumber = AppVersion.getBuildNumber();
        assertNotNull(buildNumber);
        assertTrue(buildNumber.length() > 0);
    }

    @Test
    public void getCommit_ReturnsExpectedCommitHash() {
        String commit = AppVersion.getCommit();
        assertNotNull(commit);
        assertTrue(commit.length() == 40); // expected length of a SHA-256 hash
    }

    @Test
    public void getChangelist_ThrowsException() {
        try {
            AppVersion.getChangelist();
            fail("Expected exception was not thrown.");
        } catch (java.lang.DeprecatedException e) {
            // Expected
        }
    }

    @Test
    public void toString_ReturnsExpectedStringRepresentation() {
        String expected = "build1, version1";
        AppVersion appVersion = new AppVersion("build1", "version1");
        assertEquals(expected, appVersion.toString());
    }

    @Test
    public void hashCode_returnsUniqueHashCodeForSameAppVersion() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        assertNotEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

    @Test
    public void equals_TwoSameAppVersionsReturnsTrue() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        assertTrue(appVersion1.equals(appVersion2));
    }

}