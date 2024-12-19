package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection;

public class GeneratedDecodePartTest {

    @Test
    public void decodePartTest() throws Exception {
        assertEquals("ä€", UrlBuilder.decodePart("ä€"));
        try {
            UrlBuilder.decodePart(null);
            fail();
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}