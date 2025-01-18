package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyVal_ValidKeyVal_Test {

    @Test
    public void appendKeyVal_ValidKeyVal_Test() {
        try {
            URL inputUrl = new URL("https://this.is.a.valid.url/path");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");

            urlBuilder.appendKeyVal(keyVal);

            URL build = urlBuilder.build();

            Assert.assertTrue("URL should contain key=value", build.getQuery().contains("key=value"));
        } catch (UnsupportedEncodingException | MalformedURLException e) {
            Assert.fail("This test case should not throw any exceptions");
        }
    }

}