package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.Assert;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendKeyValAppendKeyValTest {

    @Test
    public void appendKeyValAppendKeyValTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        String key = "key";
        String value = "value";
        String expected = URLEncoder.encode(key, "UTF-8")
                + "="
                + URLEncoder.encode(value, "UTF-8");

        urlBuilder.appendKeyVal(new Connection.KeyVal(key, value));

        Assert.assertEquals(expected, urlBuilder.q.toString());
    }

}