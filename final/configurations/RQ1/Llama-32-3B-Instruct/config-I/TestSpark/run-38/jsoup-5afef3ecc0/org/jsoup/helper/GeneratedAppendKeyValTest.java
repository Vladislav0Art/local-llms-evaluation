package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.HashMap;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        try {
            builder.appendKeyVal(kv);
            assertTrue(builder.q.toString().contains("key=value"));
        } catch (UnsupportedEncodingException e) {
        }
    }

}