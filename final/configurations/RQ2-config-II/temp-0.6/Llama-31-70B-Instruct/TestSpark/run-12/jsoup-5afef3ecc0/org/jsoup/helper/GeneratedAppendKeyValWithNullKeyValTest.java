package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URL;

public class GeneratedAppendKeyValWithNullKeyValTest {

    @Test
    public void appendKeyValWithNullKeyValTest() throws UnsupportedEncodingException {
        Connection.KeyVal nullKeyVal = null;
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path"));
        urlBuilder.appendKeyVal(nullKeyVal);
        Assert.assertEquals("https://example.com/path", urlBuilder.build().toString());
    }

}