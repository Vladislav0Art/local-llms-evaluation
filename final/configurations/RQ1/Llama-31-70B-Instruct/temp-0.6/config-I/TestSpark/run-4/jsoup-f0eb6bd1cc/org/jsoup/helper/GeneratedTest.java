package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void buildTest() {
        // Arrange
        URL inputUrl = new URL("https://www.example.com/");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Act
        URL actual = builder.build();

        // Assert
        assertEquals(inputUrl, actual);
    }

    @Test
    public void appendKeyValTest() {
        // Arrange
        URL inputUrl = new URL("https://www.example.com/");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");

        // Act
        builder.appendKeyVal(kv);

        // Assert
        assertNotNull(builder.q);
    }

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