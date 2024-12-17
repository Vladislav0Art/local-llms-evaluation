package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedAppendKeyVal_noException {

    @Test
    public void appendKeyVal_noException() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        urlBuilder.appendKeyVal(new java.util.HashMap<>());
        assertNull(urlBuilder.build().getHeader("Content-Type"));
    }

}