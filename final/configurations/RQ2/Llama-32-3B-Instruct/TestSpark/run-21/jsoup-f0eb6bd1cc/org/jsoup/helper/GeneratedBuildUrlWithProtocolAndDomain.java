package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildUrlWithProtocolAndDomain {

    @Test
    public void buildUrlWithProtocolAndDomain() throws MalformedURLException {
        // Given:
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));

        // When:
        URL url = builder.build();

        // Then:
        assertEquals("http://example.com", url.toString());
    }

}