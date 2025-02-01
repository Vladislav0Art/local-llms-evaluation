package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedBuildInvalidUrlTest {

    @Test
    public void buildInvalidUrlTest() throws MalformedURLException {
        URL url = new URL("http://тест.ком");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
    }

}