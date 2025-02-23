package org.jsoup.helper;

import org.junit.Test;

import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildUrlTest {

    @Test
    public void buildUrlTest() throws URISyntaxException, MalformedURLException {
        // Given
        URL inputUrl = new URL("http://www.example.com/test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // When
        URL result = urlBuilder.build();

        // Then
        assertEquals(inputUrl, result);
    }

}