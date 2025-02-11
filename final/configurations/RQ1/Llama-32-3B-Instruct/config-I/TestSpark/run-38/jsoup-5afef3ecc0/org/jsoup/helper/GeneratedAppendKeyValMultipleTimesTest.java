package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.HashMap;

public class GeneratedAppendKeyValMultipleTimesTest {

    @Test
    public void appendKeyValMultipleTimesTest() {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        try {
            builder.appendKeyVal(kv1);
            builder.appendKeyVal(kv2);
            assertTrue(builder.q.toString().contains("key1=value1%26key2=value2"));
        } catch (UnsupportedEncodingException e) {
        }
    }

}