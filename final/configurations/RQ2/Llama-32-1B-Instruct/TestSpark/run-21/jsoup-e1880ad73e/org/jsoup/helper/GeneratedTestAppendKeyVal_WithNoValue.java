package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestAppendKeyVal_WithNoValue {

    @Test
    public void testAppendKeyVal_WithNoValue() {
        String key = "name";
        when(keyVal.getKey()).thenReturn(key);
        when(value.getValue()).thenThrow(new UnsupportedEncodingException());
        UrlBuilder urlBuilder = new UrlBuilder(null); // mock URL input
        urlBuilder.appendKeyVal(mock(Connection.KeyVal.class));
        assertNull(urlBuilder.build());
    }

}