package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class Generated[UrlBuilder_appendKeyVal]

Test {

    @Test
    public void [UrlBuilder_appendKeyVal]Test() {
        String url = "http://example.com/path?query=value";
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL(url));
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertEquals("http://example.com/path?query=value&key=value&key2=value2", builder.q.toString());
    }

}