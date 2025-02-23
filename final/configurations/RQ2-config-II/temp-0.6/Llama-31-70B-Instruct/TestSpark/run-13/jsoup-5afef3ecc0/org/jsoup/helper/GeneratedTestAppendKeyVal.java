package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestAppendKeyVal {

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

}