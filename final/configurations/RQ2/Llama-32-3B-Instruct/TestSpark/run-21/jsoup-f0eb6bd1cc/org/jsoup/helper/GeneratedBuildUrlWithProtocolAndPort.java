package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildUrlWithProtocolAndPort {

    @Test
    public void buildUrlWithProtocolAndPort() throws MalformedURLException {
        // Given:
        UrlBuilder builder = new UrlBuilder(new URL("http://localhost:8080"));

        // When:
        URL url = builder.build();

        // Then:
        assertEquals("http://localhost:8080", url.toString());
    }

}