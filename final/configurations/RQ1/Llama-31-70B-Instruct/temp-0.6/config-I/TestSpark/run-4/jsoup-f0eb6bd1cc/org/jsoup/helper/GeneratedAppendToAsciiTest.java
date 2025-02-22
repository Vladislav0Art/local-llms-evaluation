package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendToAsciiTest {

    @Test
    public void appendToAsciiTest() {
        // Arrange
        String s = "example";
        boolean spaceAsPlus = true;
        StringBuilder sb = new StringBuilder();

        // Act
        UrlBuilder.appendToAscii(s, spaceAsPlus, sb);

        // Assert
    }

}