package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.net.MalformedURLException;

public class GeneratedAppendKeyValWithEmptyValueTest {

    @Test
    public void appendKeyValWithEmptyValueTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.build().getQuery());
        assertEquals("", builder.build().getQuery());
    }

}