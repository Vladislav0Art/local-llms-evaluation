package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.jsoup.helper.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedBuildInvalidUrlTest {

    @Test
    public void buildInvalidUrlTest() throws MalformedURLException {
        URL url = new URL("ht:://www.invalidurl");
        UrlBuilder builder = new UrlBuilder(url);

        URL builtUrl = builder.build();
    }

}