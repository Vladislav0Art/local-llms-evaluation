package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedAppendKeyValWithInvalidKeyVal {

    @Test
    public void appendKeyValWithInvalidKeyVal() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        org.jsoup.Connection.KeyVal keyVal = new ConnectionKeyVal("", "");
        try {
            urlBuilder.appendKeyVal(keyVal);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

}