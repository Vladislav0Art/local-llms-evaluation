package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest_NullKeyVal_ThrowsException {

    @Test
    public void appendKeyValTest_NullKeyVal_ThrowsException() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        try {
            urlBuilder.appendKeyVal(null);
            fail();
        } catch (NullPointerException e) {
            assertTrue(e.getMessage().contains("Key value must not be null"));
        }
    }

}