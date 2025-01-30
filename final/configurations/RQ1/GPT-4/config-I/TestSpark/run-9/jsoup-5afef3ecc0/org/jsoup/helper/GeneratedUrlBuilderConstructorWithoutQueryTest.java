package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedUrlBuilderConstructorWithoutQueryTest {

    @Test
    public void UrlBuilderConstructorWithoutQueryTest() throws Exception {
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("URL should be same as input URL", inputUrl, urlBuilder.u);
        assertNull("Query string should be null", urlBuilder.q);
    }

}