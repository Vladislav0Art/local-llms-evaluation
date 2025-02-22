package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildWithQuery {

    @Test
    public void buildWithQuery() throws MalformedURLException {
        URL inputUrl = new URL("https://example.com?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("key=value", urlBuilder.q.toString());
        URL expectedUrl = new URL("https://xn--example-hva.com?key=value");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}