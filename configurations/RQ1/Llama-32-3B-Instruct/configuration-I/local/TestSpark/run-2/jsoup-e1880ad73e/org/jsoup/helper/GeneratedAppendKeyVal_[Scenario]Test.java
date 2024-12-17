package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyVal_[Scenario]

Test {

    @Test
    public void appendKeyVal_[ Scenario]Test() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertEquals("key=value", builder.q.toString());
    }

}