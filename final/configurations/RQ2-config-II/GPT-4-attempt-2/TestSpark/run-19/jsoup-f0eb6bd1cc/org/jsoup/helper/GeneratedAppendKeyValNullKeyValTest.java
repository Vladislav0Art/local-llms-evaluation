package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.Test;
import org.junit.Assert;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValNullKeyValTest {

    @Test
    public void appendKeyValNullKeyValTest() {
        // given
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        KeyVal kv = null;

        // when
        try {
            builder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // then
            // should throw UnsupportedEncodingException
            Assert.assertTrue(e instanceof UnsupportedEncodingException);
        }
    }

}