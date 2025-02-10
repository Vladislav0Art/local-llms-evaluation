package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
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

import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValArrayKey {

    @Test
    public void appendKeyValArrayKey() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal[] kv = new Connection.KeyVal[]{new Connection.KeyVal("k1", "v1"), new Connection.KeyVal("k2", "v2")};
        builder.appendKeyVal(kv);
        String query = ((URL) builder.build()).getQuery();
        assertEquals("k1=v1&k2=v2", query);
    }

}