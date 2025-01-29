package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestAppendKeyVal_WithException {

    private UrlBuilder urlBuilder;

    @BeforeEach
    public void init() {
        urlBuilder = new UrlBuilder("http://example.com");
    }

    @Test
    public void testAppendKeyVal_WithException() {
        String key = "key";
        String value = "value";

        Mockito.when(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class))).thenThrow(UnsupportedEncodingException.class);
        try {
            urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}