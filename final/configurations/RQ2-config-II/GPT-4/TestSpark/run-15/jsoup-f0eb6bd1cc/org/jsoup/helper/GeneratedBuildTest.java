package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.jsoup.helper.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL url = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);

        URL builtUrl = builder.build();

        assertEquals("http://www.example.com", builtUrl.toString());
    }

}