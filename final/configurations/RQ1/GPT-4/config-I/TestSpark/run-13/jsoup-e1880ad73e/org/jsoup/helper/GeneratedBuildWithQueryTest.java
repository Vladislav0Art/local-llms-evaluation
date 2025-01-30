package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildWithQueryTest {

    @Test
    public void buildWithQueryTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com?query=value");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://example.com?query=value");
        assertEquals(expectedUrl, builder.build());
    }

}