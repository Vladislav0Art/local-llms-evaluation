package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.Validate;
import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

public class GeneratedBuildUrlWithFragmentTest {

    @Test
    public void buildUrlWithFragmentTest() throws Exception {
        URL url = new URL("http://example.com#fragment");
        UrlBuilder builder = new UrlBuilder(url);
        URL builtUrl = builder.build();
        assertEquals(url, builtUrl);
    }

}