package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedBuildValidUrlTest {

    @Test
    public void buildValidUrlTest() throws MalformedURLException {
        URL url = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertNotNull(result);
    }

}