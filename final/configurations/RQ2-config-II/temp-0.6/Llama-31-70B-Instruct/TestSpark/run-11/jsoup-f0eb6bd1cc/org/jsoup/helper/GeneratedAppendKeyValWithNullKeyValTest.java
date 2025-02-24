package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValWithNullKeyValTest {

    @Test
    public void appendKeyValWithNullKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(null);
        assertNull(urlBuilder.build());
    }

}