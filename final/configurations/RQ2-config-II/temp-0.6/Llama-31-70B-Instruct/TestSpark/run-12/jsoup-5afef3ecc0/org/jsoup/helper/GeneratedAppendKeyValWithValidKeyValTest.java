package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URL;

public class GeneratedAppendKeyValWithValidKeyValTest {

    @Test
    public void appendKeyValWithValidKeyValTest() throws UnsupportedEncodingException {
        Connection.KeyVal validKeyVal = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path"));
        urlBuilder.appendKeyVal(validKeyVal);
        Assert.assertEquals("https://example.com/path?key=value", urlBuilder.build().toString());
    }

}