package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL builtUrl = urlBuilder.build();

        assertNotNull(builtUrl);
        assertEquals("http", builtUrl.getProtocol());
        assertEquals("www.example.com", builtUrl.getHost());
    }

}