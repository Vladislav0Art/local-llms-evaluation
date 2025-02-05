package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValWithUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValWithUnsupportedEncodingExceptionTest() {
        try {
            URL inputUrl = new URL("http://localhost");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = Connection.KeyVal.create("key", "\uD800");
            urlBuilder.appendKeyVal(kv);
        } catch (Exception e) {
            throw new UnsupportedEncodingException();
        }
    }

}