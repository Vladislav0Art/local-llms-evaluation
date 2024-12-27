package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.EnumSet;

public class GeneratedAppendKeyVal {

    @Test
    public void appendKeyVal() {
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(kv);
        assertEquals("https://example.com?key=value", builder.build().toString());
    }

}