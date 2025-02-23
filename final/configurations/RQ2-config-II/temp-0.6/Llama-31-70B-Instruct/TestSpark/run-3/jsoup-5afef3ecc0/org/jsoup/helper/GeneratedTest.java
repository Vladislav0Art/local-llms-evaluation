package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void constructor_shouldSetUrl() throws URISyntaxException {
        // Given
        URL url = Mockito.mock(URL.class);
        when(url.getQuery()).thenReturn("key1=value1&key2=value2");

        // When
        UrlBuilder urlBuilder = new UrlBuilder(url);

        // Then
        assertEquals(url, urlBuilder.u);
    }

}