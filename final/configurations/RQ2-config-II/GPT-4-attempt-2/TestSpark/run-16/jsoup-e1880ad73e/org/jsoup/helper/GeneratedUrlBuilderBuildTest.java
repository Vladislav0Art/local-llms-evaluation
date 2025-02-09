package org.jsoup.helper;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderBuildTest {

    @Test
    public void urlBuilderBuildTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals(url, result);
    }

}