package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void parseName_ValidName_ReturnsParsedAppVersion() {
        // Arrange
        String amiName = "1.0-ami-1234";

        // Act
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);

        // Assert
        assertEquals("1", parsedAppVersion.getVersion());
        assertEquals("ami", parsedAppVersion.getPackageName());
        assertEquals("1234", parsedAppVersion.getBuildNumber());
    }

    @Test
    public void parseName_InvalidFormat_ThrowsParseException() {
        // Arrange
        String amiName = "invalid-ami-name";

        // Act and Assert
        assertNotNull(AppVersion.parseName(amiName));
    }

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        // Arrange
        AppVersion appVersion1 = new AppVersion("1.0", "ami-1234");
        AppVersion appVersion2 = new AppVersion("1.0", "ami-1234");

        // Act
        int comparisonResult = appVersion1.compareTo(appVersion2);

        // Assert
        assertEquals(0, comparisonResult);
    }

    @Test
    public void compareTo_DifferentAppVersions_ReturnsNegativeValue() {
        // Arrange
        AppVersion appVersion1 = new AppVersion("1.0", "ami-1234");
        AppVersion appVersion2 = new AppVersion("2.0", "ami-5678");

        // Act
        int comparisonResult = appVersion1.compareTo(appVersion2);

        // Assert
        assertTrue(comparisonResult < 0);
    }

    @Test
    public void getAppVersionPattern_ReturnsPattern() {
        // Arrange and Act
        Pattern pattern = AppVersion.getAppVersionPattern();

        // Assert
        assertTrue(pattern != null && pattern.matcher("1.0-ami-1234").matches());
    }

    @Test
    public void getPackageName

    ReturnsPackageName() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act
        String packageName = appVersion.getPackageName();

        // Assert
        assertEquals("ami", packageName);
    }

    @Test
    public void getVersion_ReturnsVersion() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act
        String version = appVersion.getVersion();

        // Assert
        assertEquals("1.0", version);
    }

    @Test
    public void getBuild_ReturnsBuild() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act
        String build = appVersion.getBuild();

        // Assert
        assertEquals("1234", build);
    }

    @Test
    public void getCommit_ReturnsCommit() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act
        String commit = appVersion.getCommit();

        // Assert
        assertEquals("commit123", commit);
    }

    @Test
    public void getChangelist_ThrowsDeprecatedException() {
        // Arrange

        // Act and Assert
        assertThrows(NullPointerException.class, () -> AppVersion.getChangelist());
    }

    @Test
    public void toString_ReturnsCorrectStringRepresentation() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act
        String stringRepresentation = appVersion.toString();

        // Assert
        assertTrue(stringRepresentation.contains("1.0"));
        assertTrue(stringRepresentation.contains("ami-1234"));
    }

    @Test
    public void hashCode_ReturnsCorrectHashCode() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act
        int hash = appVersion.hashCode();

        // Assert
        assertTrue(hash != 0);
    }

    @Test
    public void equals_SameObjects_ReturnsTrue() {
        // Arrange
        AppVersion appVersion1 = new AppVersion("1.0", "ami-1234");
        AppVersion appVersion2 = new AppVersion("1.0", "ami-1234");

        // Act
        boolean result = appVersion1.equals(appVersion2);

        // Assert
        assertTrue(result);
    }

    @Test
    public void equals_SameAppVersion_ReturnsTrue() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act and Assert
        boolean result = appVersion.equals(appVersion);
        assertTrue(result);
    }

}