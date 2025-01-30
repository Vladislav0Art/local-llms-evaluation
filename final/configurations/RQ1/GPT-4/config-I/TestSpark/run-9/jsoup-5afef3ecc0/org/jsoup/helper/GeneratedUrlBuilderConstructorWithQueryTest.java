package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedUrlBuilderConstructorWithQueryTest {

    @Test
    public void UrlBuilderConstructorWithQueryTest() throws Exception {
        URL inputUrl = new URL("http://example.com/path?param1=value1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("URL should be same as input URL", inputUrl, urlBuilder.u);
        assertEquals("Query string should be same as URL query", "param1=value1", urlBuilder.q.toString());
    }

}