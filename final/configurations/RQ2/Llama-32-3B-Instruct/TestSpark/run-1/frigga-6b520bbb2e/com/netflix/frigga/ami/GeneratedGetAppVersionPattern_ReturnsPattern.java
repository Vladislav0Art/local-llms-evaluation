package com.netflix.frigga.ami;

public class GeneratedGetAppVersionPattern_ReturnsPattern {

    @Test
    public void getAppVersionPattern_ReturnsPattern() {
        // Arrange and Act
        Pattern pattern = AppVersion.getAppVersionPattern();

        // Assert
        assertTrue(pattern != null && pattern.matcher("1.0-ami-1234").matches());
    }

}