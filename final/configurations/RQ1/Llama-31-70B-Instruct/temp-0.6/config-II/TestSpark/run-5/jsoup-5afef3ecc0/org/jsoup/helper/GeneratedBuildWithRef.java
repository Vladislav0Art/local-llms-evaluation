package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildWithRef {

    @Test
    public void buildWithRef() throws MalformedURLException {
        URL inputUrl = new URL("https://example.com#ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("ref", urlBuilder.u.getRef());
        URL expectedUrl = new URL("https://xn--example-hva.com#ref");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}