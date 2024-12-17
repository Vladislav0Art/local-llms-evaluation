package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedAppendKeyValWithMultipleQuery {

    @Test
    public void appendKeyValWithMultipleQuery() {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        builder.appendKeyVal(kv1);
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        builder.appendKeyVal(kv2);
        assertEquals("key1=value1&key2=value2", StringUtil.toString(builder.q));
    }

}