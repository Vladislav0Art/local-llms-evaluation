package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyValNullTest {

    @Test
    public void appendKeyValNullTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        urlBuilder.appendKeyVal(null);
    }

}