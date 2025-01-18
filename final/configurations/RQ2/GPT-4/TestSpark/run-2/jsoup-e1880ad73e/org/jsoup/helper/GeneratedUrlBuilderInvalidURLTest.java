package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderInvalidURLTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void UrlBuilderInvalidURLTest() {
        thrown.expect(MalformedURLException.class);
        URL inputUrl = new URL("htp://invalid.url.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        assertEquals(inputUrl, urlBuilder.build());
    }

}