package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("http://www.google.com/?key=value", urlBuilder.build().toString());
    }

}