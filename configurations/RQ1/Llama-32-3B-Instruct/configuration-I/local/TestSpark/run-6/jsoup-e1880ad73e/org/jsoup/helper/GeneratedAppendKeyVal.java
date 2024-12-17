package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedAppendKeyVal {

    @Test
    public void appendKeyVal() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        builder.appendKeyVal(kv);
        assertEquals("key=value", StringUtil.toString(builder.q));
    }

}