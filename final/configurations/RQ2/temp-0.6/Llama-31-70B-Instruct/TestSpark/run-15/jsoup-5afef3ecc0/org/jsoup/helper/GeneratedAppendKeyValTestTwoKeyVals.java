package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValTestTwoKeyVals {

    @Test
    public void appendKeyValTestTwoKeyVals() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/index.html");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1", "UTF-8");
        urlBuilder.appendKeyVal(kv1);
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2", "UTF-8");
        urlBuilder.appendKeyVal(kv2);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://example.com/index.html?key1=value1&key2=value2", builtUrl.toString());
    }

}