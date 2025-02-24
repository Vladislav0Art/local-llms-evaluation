package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        // Arrange
        String amiName = "ami-12345";
        AppVersion expected = new AppVersion();

        // Act
        AppVersion actual = AppVersion.parseName(amiName);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void compareToTest() {
        // Arrange
        AppVersion other = mock(AppVersion.class);
        AppVersion appVersion = new AppVersion();
        int expected = 0;

        // Act
        int actual = appVersion.compareTo(other);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getAppVersionPatternTest() {
        // Arrange
        Pattern expected = Pattern.compile("");

        // Act
        Pattern actual = AppVersion.getAppVersionPattern();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getPackageNameTest() {
        // Arrange
        AppVersion appVersion = new AppVersion();
        String expected = "packageName";

        // Act
        String actual = appVersion.getPackageName();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getVersionTest() {
        // Arrange
        AppVersion appVersion = new AppVersion();
        String expected = "version";

        // Act
        String actual = appVersion.getVersion();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getBuildJobNameTest() {
        // Arrange
        AppVersion appVersion = new AppVersion();
        String expected = "jobName";

        // Act
        String actual = appVersion.getBuildJobName();

        // Assert
        assertEquals(expected, actual);
    }

}