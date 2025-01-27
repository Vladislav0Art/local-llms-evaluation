package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.net.MalformedURLException;

public class GeneratedAppendKeyValWithNonEmptyValueTest {

    @Test
    public void appendKeyValWithNonEmptyValueTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.build().getQuery());
        assertEquals("key=value", builder.build().getQuery());
    }

}