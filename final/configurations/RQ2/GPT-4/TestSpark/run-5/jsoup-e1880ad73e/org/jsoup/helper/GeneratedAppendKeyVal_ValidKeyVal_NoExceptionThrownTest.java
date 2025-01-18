package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyVal_ValidKeyVal_NoExceptionThrownTest {

    @Test
    public void appendKeyVal_ValidKeyVal_NoExceptionThrownTest() {
        try {
            URL inputUrl = new URL("https://this.is.a.valid.url/path");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

            urlBuilder.appendKeyVal(Connection.KeyVal.create("key", "value"));
        } catch (UnsupportedEncodingException | MalformedURLException e) {
            Assert.fail("No exception should be thrown");
        }
    }

}