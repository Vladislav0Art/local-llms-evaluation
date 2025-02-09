package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyValValidEncodingTest {

    @Test
    public void appendKeyValValidEncodingTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("test_key", "valid_encoding_key_value_string"));
        URL resultUrl = urlBuilder.build();
        Assert.assertTrue(resultUrl.toExternalForm().contains("test_key=valid_encoding_key_value_string"));
    }

}