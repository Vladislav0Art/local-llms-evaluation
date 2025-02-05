package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = Connection.KeyVal.create("key", "val");
            urlBuilder.appendKeyVal(kv);
            URL outputUrl = urlBuilder.build();
            Assert.assertTrue(outputUrl.toString().endsWith("key=val"));
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            Assert.fail("Test failed with exception: " + e.getMessage());
        }
    }

}