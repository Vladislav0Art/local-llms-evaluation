package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        try {
            URL url = new URL("http://www.test.com?k1=v1");
            UrlBuilder builder = new UrlBuilder(url);
            builder.appendKeyVal(Connection.KeyVal.create("k1", "v2"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}