package org.jsoup.helper;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void build_validInput_validOutputTest() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL outputUrl = urlBuilder.build();

        // Assert
        assertEquals("http://example.com", outputUrl.toString());
    }

    @Test
    public void build_invalidInput_throwsExceptionTest() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL outputUrl = urlBuilder.build();
    }

    @Test
    public void appendKeyVal_validInput_validOutputTest() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");

        // Act
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertNotNull(urlBuilder.build());
    }

    @Test
    public void appendKeyVal_invalidInput_throwsExceptionTest() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");

        // Act
        urlBuilder.appendKeyVal(kv);
    }

}