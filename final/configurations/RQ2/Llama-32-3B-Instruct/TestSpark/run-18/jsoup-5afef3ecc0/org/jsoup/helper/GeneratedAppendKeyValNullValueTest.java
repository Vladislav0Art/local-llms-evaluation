package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyValNullValueTest {

    @Test
    public void appendKeyValNullValueTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        try {
            builder.appendKeyVal(kv);
            fail();
        } catch (UnsupportedEncodingException e) {
        }
    }

}