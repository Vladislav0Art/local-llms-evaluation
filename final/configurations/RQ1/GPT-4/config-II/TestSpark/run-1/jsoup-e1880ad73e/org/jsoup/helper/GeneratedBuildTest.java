package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://test.com:8080/temp/index.html?param=value#section");

        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL result = urlBuilder.build();

        assertNotNull(result);
        assertEquals(new URL("http://test.com:8080/temp/index.html?param=value#section"), result);
    }

}