package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedBuildMethodReturnsUrlTest {

    @Test
    public void buildMethodReturnsUrlTest() throws MalformedURLException, URISyntaxException {
        // Arrange
        URL url = new URL("http://example.com");

        // Act
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();

        // Assert
        assertNotNull(result);
        assertEquals("http://example.com", result.getProtocol());
        assertEquals("example.com", result.getHost());
    }

}