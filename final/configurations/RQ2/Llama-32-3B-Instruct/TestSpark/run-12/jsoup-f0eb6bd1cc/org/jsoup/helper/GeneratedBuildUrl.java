package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

import org.jsoup.Connection.KeyVal;
import org.jsoup.util.DataUtil;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedBuildUrl {

    @Test
    public void buildUrl() {
        // Given
        URL url = new URL("http://example.com");

        // When
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();

        // Then
        assertNotNull(result);
        assertEquals("http://example.com", result.toString());
    }

}