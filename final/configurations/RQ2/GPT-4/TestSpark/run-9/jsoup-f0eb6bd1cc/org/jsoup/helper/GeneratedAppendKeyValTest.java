package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal keyVal = Connection.data("key", "value");

        urlBuilder.appendKeyVal(keyVal);

        URL resultUrl = urlBuilder.build();

        Assert.assertEquals("http://example.com?key=value", resultUrl.toString());
    }

}