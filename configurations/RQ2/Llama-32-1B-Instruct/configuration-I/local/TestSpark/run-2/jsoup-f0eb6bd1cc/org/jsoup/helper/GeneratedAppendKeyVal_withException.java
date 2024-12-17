package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedAppendKeyVal_withException {

    @Test
    public void appendKeyVal_withException() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        urlBuilder.appendKeyVal(new java.util.HashMap<>());
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(null));
    }

}