package com.netflix.frigga.ami;

public class GeneratedTest {

    private AppVersion appVersion;
    private String amiName;

    @Test
    public void parseNameTest_ValidAmiName() {
        // Arrange
        amiName = "ami-name";

        // Act
        appVersion = AppVersion.parseName(amiName);

        // Assert
        assertNotNull(appVersion);
    }

    @Test
    public void parseNameTest_NullAmiName() {
        // Arrange
        amiName = null;

        // Act
        appVersion = AppVersion.parseName(amiName);

        // Assert
        assertNull(appVersion);
    }

    @Test
    public void parseNameTest_EmptyAmiName() {
        // Arrange
        amiName = "";

        // Act
        appVersion = AppVersion.parseName(amiName);

        // Assert
        assertNull(appVersion);
    }
}

@Test
public void compareToTest_Equal() {
    // Arrange
    appVersion = new AppVersion();
    other = appVersion;

    // Act
    int result = appVersion.compareTo(other);

    // Assert
    assertEquals(0, result);
}

@Test
public void compareToTest_NullOther() {
    // Arrange
    appVersion = new AppVersion();
    other = null;

    // Act
    int result = appVersion.compareTo(other);

    // Assert
    assertEquals(1, result);
}

}