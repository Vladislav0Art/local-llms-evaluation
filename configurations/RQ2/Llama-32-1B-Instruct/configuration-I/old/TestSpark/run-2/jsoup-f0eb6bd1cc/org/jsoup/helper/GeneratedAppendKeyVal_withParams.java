package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedAppendKeyVal_withParams {

    @Test
    public void appendKeyVal_withParams() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com?a=1&b=2");
        urlBuilder.appendKeyVal(new java.util.HashMap<>());
        assertEquals("a=1&a=2", urlBuilder.build().toString());
    }

}