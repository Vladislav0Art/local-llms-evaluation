package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("https://test.com"));
            urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
            urlBuilder.appendKeyVal(new Connection.KeyVal("key2", "value2"));
            URL url = urlBuilder.build();
            assertTrue(url.toString().contains("key1=value1"));
            assertTrue(url.toString().contains("key2=value2"));
        } catch (Exception e) {
            fail("This test should not raise an exception");
        }
    }

}