package org.jsoup.helper;

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

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedAppendKeyVal_keyValueWithQuery {

    @Test
    public void appendKeyVal_keyValueWithQuery() {
        String inputUrl = "https://example.com/path?c=d";
        Connection.KeyVal kv = Connection.KeyVal.newBuilder().key("a").value("b").build();
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        assertEquals("https://example.com/path?a=b&c=d", urlBuilder.build().toString());
    }

}