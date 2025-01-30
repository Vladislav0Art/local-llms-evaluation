package org.jsoup.helper;

import org.junit.Test;

import java.net.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyValBasicTest {

    @Test
    public void appendKeyValBasicTest() throws Exception {
        URL url = new URL("https://www.example.com");
        UrlBuilder ub = new UrlBuilder(url);
        Connection.KeyVal kv = org.jsoup.helper.HttpConnection.KeyVal.create("key", "value");
        ub.appendKeyVal(kv);
        URL result = ub.build();
        assertEquals(result.toString(), "https://www.example.com?key=value");
    }

}