package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValNullTest {

    @Test
    public void appendKeyValNullTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        urlBuilder.appendKeyVal(null);

        URL buildUrl = urlBuilder.build();

        Assert.assertEquals(inputUrl, buildUrl);
    }

}