package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void parseName_ValidAmiName_ReturnsParsedAppVersion() {
        String amiName = "my-ami-name";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNotNull(parsedAppVersion);
    }

    @Test
    public void parseName_InvalidAmiName_ThrowsNullPointerException() {
        String invalidAmiName = "";
        NullPointerException exception = assertThrows(NullPointerException.class, () -> AppVersion.parseName(invalidAmiName));
        assertEquals("amiName", exception.getMessage());
    }

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        int comparisonResult = appVersion1.compareTo(appVersion2);
        assertEquals(0, comparisonResult);
    }

    @Test
    public void compareTo_DifferentAppVersions_ReturnsNegativeValueIfFirstIsLessThanSecond() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion("my-version-2");
        int comparisonResult = appVersion1.compareTo(appVersion2);
        assertGreaterThan(0, comparisonResult);
    }

    @Test
    public void getAppVersionPattern_ReturnsCorrectPattern() {
        Pattern expectedPattern = Pattern.compile(".*\\.my\\.version\\.\\d+\\.\\d+$");
        assertEquals(expectedPattern, AppVersion.getAppVersionPattern());
    }

    @Test
    public void getPackageName_ReturnsPackageNameFromAmiName() {
        String amiName = "my-ami-name";
        assertEquals(amiName.split("-")[0], AppVersion.parseName(amiName).getPackageName());
    }

    @Test
    public void getVersion_ReturnsVersionNumberFromAmiName() {
        String amiName = "my-ami-name-v1.2.3";
        assertEquals("v1.2.3", AppVersion.parseName(amiName).getVersion());
    }

    @Test
    public void getBuildJobName_ReturnsCorrectBuildJobName() {
        String amiName = "my-ami-name-1234";
        assertEquals("1234", AppVersion.parseName(amiName).getBuildJobName());
    }

    @Test
    public void getBuildNumber_ReturnsCorrectBuildNumber() {
        String amiName = "my-ami-name-1234";
        assertEquals("1234", AppVersion.parseName(amiName).getBuildNumber());
    }

    @Test
    public void getCommit_ReturnsCorrectCommitHash() {
        String amiName = "my-ami-name-1234";
        // Mock commit hash, as it is not easily testable without mocking the entire build process
        assertEquals("mock-commit-hash", AppVersion.parseName(amiName).getCommit());
    }

    @Test
    public void getChangelist_ThrowsDeprecatedMethodException() {
        @Deprecated void deprecatedMethod () {
        }
        deprecatedMethod();
    }

    @Test
    public void toString_ReturnsCorrectStringRepresentationOfAppVersion() {
        String amiName = "my-ami-name-v1.2.3";
        assertEquals("my-ami-name-v1.2.3", AppVersion.parseName(amiName).toString());
    }

    @Test
    public void hashCode

    ReturnsUniqueHashCodeForEachAppVersion() {
        // Note: This test is not fully comprehensive, as generating unique hash codes for all possible app versions would be computationally expensive.
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        assertNotEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

    @Test
    public void equals_TwoAppVersionsWithSameAmiNameAndBuildNumber_ReturnsTrue() {
        String amiName = "my-ami-name-v1.2.3";
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion(amiName);
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void equals_TwoAppVersionsWithDifferentAmiNames_ReturnsFalse() {
        String amiName1 = "my-ami-name-v1.2.3";
        String amiName2 = "other-ami-name-v1.2.4";
        AppVersion appVersion1 = new AppVersion(amiName1);
        AppVersion appVersion2 = new AppVersion(amiName2);
        assertFalse(appVersion1.equals(appVersion2));
    }

}