package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection.KeyVal;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyValTestWithValidInput {

    @Test
    public void appendKeyValTestWithValidInput() {
        try {
            URL inputUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            KeyVal keyVal = KeyVal.create("key", "value");
            urlBuilder.appendKeyVal(keyVal);
            URL result = urlBuilder.build();
            Assert.assertNotNull(result);
            Assert.assertTrue(result.toString().contains("key=value"));
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            Assert.fail(e.getMessage());
        }
    }

}