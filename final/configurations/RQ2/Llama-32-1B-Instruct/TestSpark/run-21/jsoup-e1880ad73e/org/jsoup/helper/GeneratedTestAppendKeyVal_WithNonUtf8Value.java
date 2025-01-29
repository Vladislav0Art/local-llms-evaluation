package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestAppendKeyVal_WithNonUtf8Value {

    @Test
    public void testAppendKeyVal_WithNonUtf8Value() {
        String key = "name";
        when(keyVal.getKey()).thenReturn(key);
        when(value.getValue()).thenThrow(new UnsupportedEncodingException("ISO-8859-1"));
        UrlBuilder urlBuilder = new UrlBuilder(null); // mock URL input
        urlBuilder.appendKeyVal(mock(Connection.KeyVal.class));
        assertNull(urlBuilder.build());
    }

}