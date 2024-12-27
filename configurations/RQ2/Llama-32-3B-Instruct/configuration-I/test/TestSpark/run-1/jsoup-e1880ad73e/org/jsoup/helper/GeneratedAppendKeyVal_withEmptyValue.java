package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.EnumSet;

public class GeneratedAppendKeyVal_withEmptyValue {

    @Test
    public void appendKeyVal_withEmptyValue() {
        Connection.KeyVal kv = Connection.KeyVal.create("key", "");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(kv);
        assertEquals("https://example.com?key=", builder.build().toString());
    }

}