package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

public class GeneratedTestBuild_WithNullUrl {

    @Test
    public void testBuild_WithNullUrl() {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(null);

        // Act
        URL resultUrl = urlBuilder.build();

        // Assert
        assertNull(resultUrl);
    }

    private URL createMockUrl() {
        URL inputUrl = null;
        try {
            inputUrl = new URL("http://www.example.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return inputUrl;
    }

}