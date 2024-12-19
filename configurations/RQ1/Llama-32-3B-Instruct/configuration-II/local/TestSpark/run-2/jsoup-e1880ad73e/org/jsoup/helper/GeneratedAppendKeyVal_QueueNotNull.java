package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;

public class GeneratedAppendKeyVal_QueueNotNull {

    @Test
    public void appendKeyVal_QueueNotNull() {
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.key = "key";
        kv.value = "value";
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertEquals("key=value", builder.q.toString());
    }

}