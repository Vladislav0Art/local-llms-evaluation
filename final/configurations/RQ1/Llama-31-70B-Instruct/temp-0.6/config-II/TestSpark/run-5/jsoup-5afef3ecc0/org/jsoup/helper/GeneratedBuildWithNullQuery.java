package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildWithNullQuery {

    @Test
    public void buildWithNullQuery() throws MalformedURLException {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNull(urlBuilder.q);
        URL expectedUrl = new URL("https://xn--example-hva.com");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}