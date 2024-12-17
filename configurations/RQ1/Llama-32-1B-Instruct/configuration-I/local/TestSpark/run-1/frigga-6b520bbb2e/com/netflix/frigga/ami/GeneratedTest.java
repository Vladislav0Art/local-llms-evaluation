package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void testParseName() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion expected = parseName(amiName);

        // Act
        AppVersion actual = new AppVersion();
        actual.parseName(amiName);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testParseNameNull() {
        // Arrange
        String amiName = null;
        AppVersion expected = parseName(amiName);

        // Act
        AppVersion actual = new AppVersion();
        actual.parseName(amiName);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testParseNameMatch() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion expected = parseName(amiName);

        // Act
        AppVersion actual = new AppVersion();
        actual.parseName(amiName);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testParseNameNonMatch() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion expected = parseName(amiName);

        // Act
        AppVersion actual = new AppVersion();
        actual.parseName(amiName);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testGetPackageName() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

        // Act
        AppVersion actual = new AppVersion();
        expected = actual.getPackageName();
        assertEquals(amiName, expected);
    }

    @Test
    public void testGetVersion() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

        // Act
        AppVersion actual = new AppVersion();
        expected = actual.getVersion();
        assertEquals(amiName, expected);
    }

    @Test
    public void testGetBuildJobName() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

        // Act
        AppVersion actual = new AppVersion();
        expected = actual.getBuildJobName();
        assertEquals(amiName, expected);
    }

    @Test
    public void testGetBuildNumber() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

        // Act
        AppVersion actual = new AppVersion();
        expected = actual.getBuildNumber();
        assertEquals(amiName, expected);
    }

    @Test
    public void testGetChangelist() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

        // Act
        AppVersion actual = new AppVersion();
        expected = actual.getChangelist();
        assertEquals(amiName, expected);
    }

    @Test
    public void testGetCommit() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

        // Act
        AppVersion actual = new AppVersion();
        expected = actual.getCommit();
        assertEquals(amiName, expected);
    }

    @Test
    public void testGetString() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

        // Act
        AppVersion actual = new AppVersion();
        expected = actual.toString();
        assertEquals(amiName, expected);
    }

    @Test
    public void testToString() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

        // Act
        AppVersion actual = new AppVersion();
        expected = actual.toString();
        assertEquals(amiName, expected);
    }

    @Test
    public void testEquals() {
        // Arrange
        String amiName1 = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        String amiName2 = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

        // Act
        AppVersion actual1 = new AppVersion();
        AppVersion actual2 = new AppVersion();
        expected = actual1.equals(actual2);
        assertTrue(expected);
    }

    @Test
    public void testHashCode() {
        // Arrange
        String amiName1 = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

        // Act
        AppVersion actual = new AppVersion();
        expected = actual.hashCode();
        assertEquals(expected, actual.hashCode());
    }

    @Test
    public void testEqualsNull() {
        // Arrange
        String amiName1 = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

        // Act
        AppVersion actual = new AppVersion();
        expected = actual.equals(null);
        assertTrue(expected);
    }

}