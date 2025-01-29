package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUrlBuilder_urlBuilderNoException {

    @Test
    public void urlBuilder_urlBuilderNoException() throws MalformedURLException {
        URLBuilder builder = new UrlBuilder(new URI("https://example.com"));
        assertEquals("https://example.com", builder.build());
    }

}