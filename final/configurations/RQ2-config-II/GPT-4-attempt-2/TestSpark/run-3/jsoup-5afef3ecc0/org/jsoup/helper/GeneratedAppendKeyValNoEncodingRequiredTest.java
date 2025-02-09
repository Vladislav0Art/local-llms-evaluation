package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValNoEncodingRequiredTest {

    @Test
    public void appendKeyValNoEncodingRequiredTest() {
        try {
            URL url = new URL("http://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);

            KeyVal kv = KeyVal.create("key", "value");
            urlBuilder.appendKeyVal(kv);

            URL result = urlBuilder.build();

            Assert.assertNotNull(result);
            Assert.assertEquals("http://www.example.com?key=value", result.toString());
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            Assert.fail("No exception should be thrown!");
        }
    }

}