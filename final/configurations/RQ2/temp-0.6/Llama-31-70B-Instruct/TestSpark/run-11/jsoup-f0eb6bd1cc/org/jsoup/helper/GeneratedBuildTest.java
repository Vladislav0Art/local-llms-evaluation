package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL url = new URL("http://www.example.com/test");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.example.com/test", builtUrl.toString());
    }

}