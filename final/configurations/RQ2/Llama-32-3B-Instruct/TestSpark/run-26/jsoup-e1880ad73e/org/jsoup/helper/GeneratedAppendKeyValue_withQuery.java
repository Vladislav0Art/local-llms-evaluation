package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedAppendKeyValue_withQuery {

    @Test
    public void appendKeyValue_withQuery() throws UnsupportedEncodingException, MalformedURLException {
        String inputUrl = "https://example.com/path?c=d";
        Connection.KeyVal kv = new org.jsoup.internal.StringUtil.KeyVal("a", "b");
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        assertEquals("https://example.com/path?a=b&c=d", urlBuilder.build().toString());
    }

}