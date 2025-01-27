package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildUrlWithProtocolAndDomainPort {

    @Test
    public void buildUrlWithProtocolAndDomainPort() throws MalformedURLException {
        // Given:
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com:8443"));

        // When:
        URL url = builder.build();

        // Then:
        assertEquals("https://example.com:8443", url.toString());
    }

}