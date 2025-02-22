package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyVal {

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com/path/");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        builder.appendKeyVal(kv);

        assertEquals("?key=value", builder.q.toString());
    }

}