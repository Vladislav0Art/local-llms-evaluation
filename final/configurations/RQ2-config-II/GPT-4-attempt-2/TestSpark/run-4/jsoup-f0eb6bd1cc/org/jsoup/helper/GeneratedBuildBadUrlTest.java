package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildBadUrlTest {

    @Test
    public void buildBadUrlTest() throws MalformedURLException {
        URL url = new URL("http:/example.com.yy");
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

}