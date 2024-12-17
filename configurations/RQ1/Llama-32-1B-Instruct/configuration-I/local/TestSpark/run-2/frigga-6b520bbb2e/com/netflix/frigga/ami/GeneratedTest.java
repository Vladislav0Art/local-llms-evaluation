package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void testParseNameNull() {
        // Arrange
        String amiName = null;

        // Act
        AppVersion parsedName = AppVersion.parseName(amiName);

        // Assert
        assertNotNull(parsedName);
    }

    @Test
    public void testParseNameEmptyString() {
        // Arrange
        String amiName = "";

        // Act
        AppVersion parsedName = AppVersion.parseName(amiName);

        // Assert
        assertNotNull(parsedName);
    }

    @Test
    public void testParseNameNonPatternMatch() {
        // Arrange
        String amiName = "invalid-pattern";

        // Act
        AppVersion parsedName = AppVersion.parseName(amiName);

        // Assert
        assertNotNull(parsedName);
    }

    @Test
    public void testParseNameValidPattern() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499";

        // Act
        AppVersion parsedName = AppVersion.parseName(amiName);

        // Assert
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0-586499", parsedName.getVersion());
    }

    @Test
    public void testParseNameNonString() {
        // Arrange
        String amiName = 123;

        // Act
        AppVersion parsedName = AppVersion.parseName(amiName);

        // Assert
        assertNotNull(parsedName);
    }

    @Test
    public void testGetPackageNameNotPresent() {
        // Arrange
        AppVersion appVersion = new AppVersion();

        // Act and Assert
        assertEquals("", appVersion.getPackageName());
    }

    @Test
    public void testGetPackageNameValidPattern() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499";

        // Act
        AppVersion parsedName = AppVersion.parseName(amiName);

        // Assert
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
    }

    @Test
    public void testGetBuildJobNameNotPresent() {
        // Arrange
        AppVersion appVersion = new AppVersion();

        // Act and Assert
        assertEquals("", appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumberNotPresent() {
        // Arrange
        AppVersion appVersion = new AppVersion();

        // Act and Assert
        assertEquals("", appVersion.getBuildNumber());
    }

    @Test
    public void testGetCommitNotPresent() {
        // Arrange
        AppVersion appVersion = new AppVersion();

        // Act and Assert
        assertEquals("", appVersion.getCommit());
    }

    @Test
    public void testToStringEmptyString() {
        // Arrange
        String amiName = "";

        // Act
        String result = AppVersion.toString(amiName);

        // Assert
        assertNotNull(result);
    }

}