package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class GeneratedNormalizeQueryTest {

    @Mock
    private URL inputUrl;

    @Test
    public void normalizeQueryTest() {
        // Arrange
        String q = "a b c";

        // Act
        String result = UrlBuilder.normalizeQuery(q);

        // Assert
        assertEquals("a+b+c", result);
    }

}