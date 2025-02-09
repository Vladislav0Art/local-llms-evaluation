package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValValidKeyValTest {

    @Test
    public void appendKeyValValidKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal keyVal = new Connection.KeyVal("key", "val");
        urlBuilder.appendKeyVal(keyVal);

        URL buildUrl = urlBuilder.build();

        Assert.assertEquals(new URL("http://example.com?key=val"), buildUrl);
    }

}