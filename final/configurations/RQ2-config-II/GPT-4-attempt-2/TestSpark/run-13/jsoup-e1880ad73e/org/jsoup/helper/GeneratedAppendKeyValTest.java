package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL url = null;
        try {
            url = new URL("http://www.example.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal keyValue = Connection.KeyVal.create("key", "value");
        builder.appendKeyVal(keyValue);
        URL outputUrl = builder.build();
        Assert.assertEquals(url + "?key=value", outputUrl.toString());
    }

}