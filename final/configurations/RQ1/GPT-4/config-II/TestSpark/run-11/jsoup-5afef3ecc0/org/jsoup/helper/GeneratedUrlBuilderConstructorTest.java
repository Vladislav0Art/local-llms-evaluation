package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void urlBuilderConstructorTest() throws Exception {
        URL url = new URL("http://www.google.com/?q=test");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://www.google.com/?q=test", urlBuilder.build().toString());
    }

}