package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testBuild() throws Exception {
        // Given
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        // When
        URL normalizedUrl = urlBuilder.build();
        // Then
        assertEquals("http://example.com", normalizedUrl.toString());
    }

    @Test
    public void testAppendKeyVal() throws Exception {
        // Given
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        // When
        urlBuilder.appendKeyVal("key=value");
        // Then
        assertEquals("key=value", urlBuilder.q.toString());
    }

    @Test
    public void testDecodePart() {
        // Given
        String encodedPart = "encoded%20part";
        // When
        String decodedPart = UrlBuilder.decodePart(encodedPart);
        // Then
        assertEquals("encoded part", decodedPart);
    }

}