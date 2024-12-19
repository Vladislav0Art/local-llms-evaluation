package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;

public class GeneratedDecodePart_DoesNotThrowException {

    @Test
    public void decodePart_DoesNotThrowException() {
        String encoded = "example.co.uk";
        UrlBuilder.DecodePart decoded = UrlBuilder.decodePart(encoded);
        assertNotNull(decoded);
        assertTrue(decoded != null);
    }

}