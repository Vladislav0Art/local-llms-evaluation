package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        try {
            URL inputUrl = new URL("http://localhost");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
            urlBuilder.appendKeyVal(kv);
            assertTrue(urlBuilder.build().getQuery().contains("key=value"));
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }

}