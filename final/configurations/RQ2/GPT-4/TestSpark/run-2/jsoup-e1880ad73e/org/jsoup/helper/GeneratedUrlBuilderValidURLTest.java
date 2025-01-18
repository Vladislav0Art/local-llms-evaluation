package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderValidURLTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void UrlBuilderValidURLTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        assertEquals(inputUrl, urlBuilder.build());
    }

}