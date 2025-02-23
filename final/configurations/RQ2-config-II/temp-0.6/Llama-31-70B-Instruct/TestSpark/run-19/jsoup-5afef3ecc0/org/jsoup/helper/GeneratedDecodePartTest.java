package org.jsoup.helper;

import org.junit.Test;

import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodePartTest {

    @Test
    public void decodePartTest() {
        // Given
        String encoded = "key%20value";

        // When
        String result = UrlBuilder.decodePart(encoded);

        // Then
        assertEquals("key value", result);
    }

}