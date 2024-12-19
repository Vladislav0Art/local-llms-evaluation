package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;

public class GeneratedAppendKeyVal_QueueNull {

    @Test
    public void appendKeyVal_QueueNull() {
        Connection.KeyVal kv = new Connection.KeyVal();
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertEquals("key=value", builder.q.toString());
    }

}