package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.net.MalformedURLException;

public class GeneratedAppendKeyValWithMultipleValuesTest {

    @Test
    public void appendKeyValWithMultipleValuesTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertNotNull(builder.build().getQuery());
        assertEquals("key1=value1&key2=value2", builder.build().getQuery());
    }

}