package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderConstructorNonEmptyURLTest {

    @Test
    public void urlBuilderConstructorNonEmptyURLTest() throws MalformedURLException {
        URL testUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        assertNotNull(urlBuilder);
    }

}