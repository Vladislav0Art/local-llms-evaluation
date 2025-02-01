package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedDecodePartTest {

    @Test
    public void decodePartTest() throws Exception {
        URL url = new URL("http://www.google.com/%C3%BA");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://www.google.com/ú", urlBuilder.build().toString());
    }

}