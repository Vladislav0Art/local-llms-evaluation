package org.jsoup.helper;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildWithQueryStringTest {

    @Test
    public void buildWithQueryStringTest() throws MalformedURLException {
        URL url = new URL("http://example.com/?param=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL newUrl = urlBuilder.build();
        assertEquals("http://example.com/?param=value", newUrl.toString());
    }

}