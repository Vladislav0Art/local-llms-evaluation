package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedAppendKeyValMethodAppendsCorrectKeyValuePairsTest {

    @Test
    public void appendKeyValMethodAppendsCorrectKeyValuePairsTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv1 = Connection.KeyVal.builder("key1", "value1").build();
        Connection.KeyVal kv2 = Connection.KeyVal.builder("key2", "value2").build();
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        URI expectedUri = new URI("http://example.com?key1=value1&key2=value2");
        assertEquals(expectedUri, new UrlBuilder(new URL("http://example.com")).build());
    }

}