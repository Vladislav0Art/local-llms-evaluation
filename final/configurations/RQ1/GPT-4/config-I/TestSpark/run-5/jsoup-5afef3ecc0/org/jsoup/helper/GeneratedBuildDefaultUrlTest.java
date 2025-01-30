package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedBuildDefaultUrlTest {

    @Test
    public void buildDefaultUrlTest() {
        try {
            URL url = new URL("http://www.test.com");
            UrlBuilder builder = new UrlBuilder(url);
            assertTrue("URL after build is not as expected", builder.build() != null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}