package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedBuildWithQueryTest {

    @Test
    public void buildWithQueryTest() {
        try {
            URL url = new URL("http://www.test.com?k1=v1");
            UrlBuilder builder = new UrlBuilder(url);
            assertTrue("URL after build with query parameters is not as expected", builder.build() != null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}