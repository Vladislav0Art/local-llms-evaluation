package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValValidTest {

    @Test
    public void appendKeyValValidTest() {
        try {
            URL inputUrl = new URL("http://example.com");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = Connection.KeyVal.create("Key", "Value");
            builder.appendKeyVal(kv);
            URL outputUrl = builder.build();
            Assert.assertTrue(outputUrl.toString().contains("Key=Value"));
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            Assert.fail();
        }
    }

}