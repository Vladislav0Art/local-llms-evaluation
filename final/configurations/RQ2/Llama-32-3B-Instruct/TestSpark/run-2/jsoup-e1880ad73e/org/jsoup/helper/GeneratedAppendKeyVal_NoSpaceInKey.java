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

public class GeneratedAppendKeyVal_NoSpaceInKey {

    @Test
    public void appendKeyVal_NoSpaceInKey() throws UnsupportedEncodingException, URISyntaxException {
        String key = "abc.def";
        Connection.KeyVal kv = Connection.KeyVal.of(key, null);
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        assertEquals(key, new String(kv.getKey(), UTF_8));
    }

}