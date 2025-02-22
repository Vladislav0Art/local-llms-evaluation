package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildWithoutRef {

    @Test
    public void buildWithoutRef() throws MalformedURLException {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNull(urlBuilder.u.getRef());
        URL expectedUrl = new URL("https://xn--example-hva.com");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}