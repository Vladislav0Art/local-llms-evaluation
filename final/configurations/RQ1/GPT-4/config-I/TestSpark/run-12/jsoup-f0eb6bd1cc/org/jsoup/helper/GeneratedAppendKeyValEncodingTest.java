package org.jsoup.helper;

import org.junit.Test;

import java.net.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyValEncodingTest {

    @Test
    public void appendKeyValEncodingTest() throws Exception {
        URL url = new URL("https://www.example.com");
        UrlBuilder ub = new UrlBuilder(url);
        Connection.KeyVal kv = org.jsoup.helper.HttpConnection.KeyVal.create("äöü", "value");
        ub.appendKeyVal(kv);
        URL result = ub.build();
        assertEquals(result.toString(), "https://www.example.com?%C3%A4%C3%B6%C3%BC=value");
    }

}