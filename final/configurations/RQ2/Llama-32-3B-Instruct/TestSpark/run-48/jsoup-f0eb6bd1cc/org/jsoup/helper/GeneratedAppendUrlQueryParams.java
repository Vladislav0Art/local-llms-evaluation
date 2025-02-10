package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder.DataKeyValTestHelper;

public class GeneratedAppendUrlQueryParams {

    @Test
    public void appendUrlQueryParams() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String result = UrlBuilder.appendUrlQueryParams(builder, HashMap.class);
        assertTrue(result.contains("?key=value"));
    }
}

public class DataKeyValTestHelper {

    public static Connection.KeyVal createKeyVal(String key, String value) {
        return new org.jsoup.Connection.KeyVal(key, StringUtil.quote(value));
    }

    public static URL createUrl(String scheme, String host, int port) throws MalformedURLException {
        return new URL(scheme + "://" + host + ":" + port);
    }

}