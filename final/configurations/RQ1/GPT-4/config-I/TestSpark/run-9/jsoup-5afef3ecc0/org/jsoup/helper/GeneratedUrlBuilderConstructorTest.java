package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL inputUrl = new URL("http://localhost/test?param1=value1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("Should set URL to input URL", inputUrl, urlBuilder.u);
        assertEquals("Should set query string to URL query", "param1=value1", urlBuilder.q.toString());
    }

}