package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValNormalValueTest {

    @Test
    public void appendKeyValNormalValueTest() throws Exception {
        URL url = new URL("http://www.someurl.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal kv = new Connection.KeyVal("name", "value");

        urlBuilder.appendKeyVal(kv);

        URL result = urlBuilder.build();

        Assert.assertTrue(result.toString().contains("name=value"));
    }

}