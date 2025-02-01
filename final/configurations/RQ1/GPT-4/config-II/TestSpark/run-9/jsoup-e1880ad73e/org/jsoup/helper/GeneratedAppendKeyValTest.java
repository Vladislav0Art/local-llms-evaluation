package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL inputUrl = new URL("http://test.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("key=value", builder.q.toString());
    }

}