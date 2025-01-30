package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value", "UTF-8");

        urlBuilder.appendKeyVal(keyVal);
        URL resultUrl = urlBuilder.build();

        Assert.assertEquals("http://www.example.com?key=value", resultUrl.toString());
    }

}