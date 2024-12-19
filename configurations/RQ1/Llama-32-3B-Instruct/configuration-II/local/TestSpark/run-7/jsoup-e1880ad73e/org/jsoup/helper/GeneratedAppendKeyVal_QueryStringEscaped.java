package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendKeyVal_QueryStringEscaped {

    @Test
    public void appendKeyVal_QueryStringEscaped() {
        Connection.KeyVal kv = new Connection.KeyVal("key with special chars !@#", "value");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        assertTrue(builder.q != null);
        builder.appendKeyVal(kv);
        assertEquals("key%20with%20special%20chars%21%40%23=value", builder.q.toString());
    }

}