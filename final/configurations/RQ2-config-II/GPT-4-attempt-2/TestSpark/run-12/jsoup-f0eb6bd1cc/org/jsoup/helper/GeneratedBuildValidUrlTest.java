package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildValidUrlTest {

    @Test
    public void buildValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals(inputUrl, builtUrl);
    }

}