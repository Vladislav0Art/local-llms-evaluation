package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.Test;
import org.junit.Assert;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValValidKeyValTest {

    @Test
    public void appendKeyValValidKeyValTest() throws Exception {
        // given
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        KeyVal kv = KeyVal.create("key", "value");

        // when
        builder.appendKeyVal(kv);
        URL builtUrl = builder.build();

        // then
        Assert.assertNotNull(builtUrl);
        Assert.assertTrue(builtUrl.toString().contains("key=value"));
    }

}