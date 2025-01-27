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

public class GeneratedAppendKeyValWithPercentEncoding {

    @Test
    public void appendKeyValWithPercentEncoding() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        org.jsoup.util.DataUtil.KeyVal kv = new org.jsoup.util.DataUtil.KeyVal("key", "value%20with%20spaces");
        builder.appendKeyVal(kv);
        String result = builder.build().toString();
        assertTrue(result.contains("?key=value%20with%20spaces"));
    }

}