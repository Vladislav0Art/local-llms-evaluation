package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.jsoup.Connection.KeyVal.create;
import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL url = new URL("https://www.example.com/?key1=val1");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = create("key2", "val2");
        urlBuilder.appendKeyVal(kv);
        URL expectedURL = new URL("https://www.example.com/?key1=val1&key2=val2");
        assertEquals(expectedURL, urlBuilder.build());
    }

}