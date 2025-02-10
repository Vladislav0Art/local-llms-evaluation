package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedAppendKeyValWithNullKeyVal {

    @Test
    public void appendKeyValWithNullKeyVal() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        org.jsoup.Connection.KeyVal keyVal = null;
        try {
            urlBuilder.appendKeyVal(keyVal);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

}