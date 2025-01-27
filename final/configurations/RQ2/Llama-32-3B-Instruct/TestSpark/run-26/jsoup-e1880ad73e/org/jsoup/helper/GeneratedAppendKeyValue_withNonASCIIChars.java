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

public class GeneratedAppendKeyValue_withNonASCIIChars {

    @Test
    public void appendKeyValue_withNonASCIIChars() throws UnsupportedEncodingException, MalformedURLException {
        String inputUrl = "https://example.com/path?e=%E3%BC%8B";
        Connection.KeyVal kv = new org.jsoup.internal.StringUtil.KeyVal("a", "b");
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        assertEquals("https://example.com/path?a=b&e=%E3%BC%8F", urlBuilder.build().toString());
    }

}