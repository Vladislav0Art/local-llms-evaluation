package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void urlBuilderConstructorTest() throws MalformedURLException {
        URL url = new URL("http://example.com?param='value'");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder);
    }

}