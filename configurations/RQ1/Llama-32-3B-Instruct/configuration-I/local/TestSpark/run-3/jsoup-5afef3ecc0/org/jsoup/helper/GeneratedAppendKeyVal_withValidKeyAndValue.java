package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Map;

public class GeneratedAppendKeyVal_withValidKeyAndValue {

    @Test
    public void appendKeyVal_withValidKeyAndValue() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertEquals("key=value", builder.q.toString());
    }

}