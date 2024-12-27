package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyVal_ValidInput_Test {

    @Test
    public void appendKeyVal_ValidInput_Test() throws Exception {
        URL inputUrl = new URL("http://www.test.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value", false);
        builder.appendKeyVal(keyVal);
        URL expectedUrl = new URL("http://www.test.com?key=value");
        Assert.assertEquals(expectedUrl, builder.build());
    }

}