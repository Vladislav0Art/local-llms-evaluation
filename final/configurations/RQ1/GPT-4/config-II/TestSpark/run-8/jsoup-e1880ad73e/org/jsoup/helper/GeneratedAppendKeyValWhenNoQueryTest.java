package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValWhenNoQueryTest {

    @Test
    public void appendKeyValWhenNoQueryTest() throws Exception {
        URL inputUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL builtUrl = urlBuilder.build();
        Assert.assertEquals("http://test.com?key=value", builtUrl.toString());
    }

}