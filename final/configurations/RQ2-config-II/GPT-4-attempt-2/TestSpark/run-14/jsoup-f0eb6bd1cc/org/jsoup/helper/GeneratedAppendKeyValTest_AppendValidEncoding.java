package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import org.jsoup.Connection;

public class GeneratedAppendKeyValTest_AppendValidEncoding {

    @Test
    public void appendKeyValTest_AppendValidEncoding() {
        URL url;
        try {
            url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value");
            urlBuilder.appendKeyVal(keyVal);
            URL outputUrl = urlBuilder.build();
            assertEquals(url + "?key=value", outputUrl.toString());
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

}