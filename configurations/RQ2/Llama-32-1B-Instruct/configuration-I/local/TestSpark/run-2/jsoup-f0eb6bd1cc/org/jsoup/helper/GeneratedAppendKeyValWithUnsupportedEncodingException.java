package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedAppendKeyValWithUnsupportedEncodingException {

    @Test
    public void appendKeyValWithUnsupportedEncodingException() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com?a=1&b=2");
        urlBuilder.appendKeyVal(new java.util.HashMap<>());
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(null));
    }

}