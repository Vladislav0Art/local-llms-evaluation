package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.EnumSet;

public class GeneratedAppendKeyVal_withMultipleParams {

    @Test
    public void appendKeyVal_withMultipleParams() {
        Connection.KeyVal kv1 = Connection.KeyVal.create("key1", "value1");
        Connection.KeyVal kv2 = Connection.KeyVal.create("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertEquals("https://example.com?key1=value1&key2=value2", builder.build().toString());
    }

}