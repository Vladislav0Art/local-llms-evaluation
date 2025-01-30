package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildWithFragmentTest {

    @Test
    public void buildWithFragmentTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com#fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://example.com#fragment");
        assertEquals(expectedUrl, builder.build());
    }

}