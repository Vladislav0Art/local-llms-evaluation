package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValURLTest {

    @Test
    public void appendKeyValURLTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.google.com"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL outputUrl = urlBuilder.build();
        assertEquals("http://www.google.com?key=value", outputUrl.toString());
    }

}