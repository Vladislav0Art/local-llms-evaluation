package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection.Request;
import org.jsoup.Connection.Response;

public class GeneratedDecodePart {

    @Test
    public void decodePart() {
        // Arrange and Act
        String decoded = UrlBuilder.decodePart("http%3A%2F%2Fexample.com");
        assertEquals("http://example.com", decoded);
    }

}