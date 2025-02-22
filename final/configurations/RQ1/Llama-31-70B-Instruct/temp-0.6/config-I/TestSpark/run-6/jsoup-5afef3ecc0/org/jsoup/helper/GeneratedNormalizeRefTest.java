package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class GeneratedNormalizeRefTest {

    @Mock
    private URL inputUrl;

    @Test
    public void normalizeRefTest() {
        // Arrange
        String r = "a b c";

        // Act
        String result = UrlBuilder.normalizeRef(r);

        // Assert
        assertEquals("a%20b%20c", result);
    }

}