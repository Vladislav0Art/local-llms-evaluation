package com.netflix.frigga.ami;

public class GeneratedGetCommit_ReturnsCommit {

    @Test
    public void getCommit_ReturnsCommit() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act
        String commit = appVersion.getCommit();

        // Assert
        assertEquals("commit123", commit);
    }

}