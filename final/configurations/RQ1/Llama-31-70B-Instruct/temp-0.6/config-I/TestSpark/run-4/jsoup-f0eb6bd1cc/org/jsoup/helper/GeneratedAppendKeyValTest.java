package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

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

}