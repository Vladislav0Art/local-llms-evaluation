package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestBuild {

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

}