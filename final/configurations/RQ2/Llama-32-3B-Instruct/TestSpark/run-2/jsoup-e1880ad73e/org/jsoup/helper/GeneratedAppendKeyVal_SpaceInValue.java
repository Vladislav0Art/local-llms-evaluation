package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendKeyVal_SpaceInValue {

    @Test
    public void appendKeyVal_SpaceInValue() throws UnsupportedEncodingException {
        String value = "abc def";
        Connection.KeyVal kv = Connection.KeyVal.of(null, value);
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        assertEquals("abc%20def", new String(kv.getValue(), UTF_8));
    }

}