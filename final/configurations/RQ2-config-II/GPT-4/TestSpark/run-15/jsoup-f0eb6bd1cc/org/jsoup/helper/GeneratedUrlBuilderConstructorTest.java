package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.jsoup.helper.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void urlBuilderConstructorTest() throws MalformedURLException {
        URL url = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);

        assertNotNull(builder);
    }

}