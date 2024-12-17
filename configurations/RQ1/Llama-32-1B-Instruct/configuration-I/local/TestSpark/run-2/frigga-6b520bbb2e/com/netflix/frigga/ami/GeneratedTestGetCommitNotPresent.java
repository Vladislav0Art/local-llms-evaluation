package com.netflix.frigga.ami;

public class GeneratedTestGetCommitNotPresent {

    @Test
    public void testGetCommitNotPresent() {
        // Arrange
        AppVersion appVersion = new AppVersion();

        // Act and Assert
        assertEquals("", appVersion.getCommit());
    }

}