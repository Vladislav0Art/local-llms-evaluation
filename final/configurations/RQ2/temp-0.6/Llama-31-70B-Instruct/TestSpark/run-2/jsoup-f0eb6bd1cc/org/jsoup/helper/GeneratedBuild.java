package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuild {

    @Test
    public void build() throws MalformedURLException, UnsupportedEncodingException, URISyntaxException {
        URL inputUrl = new URL("http://www.example.com/path/");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();

        assertEquals("http://www.example.com/path/", result.toString());
    }

}