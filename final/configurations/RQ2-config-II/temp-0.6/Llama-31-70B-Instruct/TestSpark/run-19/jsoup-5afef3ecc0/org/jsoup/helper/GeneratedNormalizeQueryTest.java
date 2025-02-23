package org.jsoup.helper;

import org.junit.Test;

import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNormalizeQueryTest {

    @Test
    public void normalizeQueryTest() {
        // Given
        String q = "key value";

        // When
        String result = UrlBuilder.normalizeQuery(q);

        // Then
        assertEquals("key+value", result);
    }

}