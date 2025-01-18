package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyVal_NullKeyVal_ThrowsExceptionTest {

    @Test
    public void appendKeyVal_NullKeyVal_ThrowsExceptionTest() {
        try {
            URL inputUrl = new URL("https://this.is.a.valid.url/path");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

            urlBuilder.appendKeyVal(null);

            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("kv can't be null", ex.getMessage());
        } catch (UnsupportedEncodingException | MalformedURLException e) {
            Assert.fail("Expected IllegalArgumentException only");
        }
    }

}