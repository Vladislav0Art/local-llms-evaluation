package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestAppendKeyVal_WithInvalidKeyValue {

    @Test
    public void testAppendKeyVal_WithInvalidKeyValue() {
        String key = "name";
        String value = "";
        when(keyVal.getKey()).thenReturn(key);
        when(value.getValue()).thenThrow(new UnsupportedEncodingException());
        UrlBuilder urlBuilder = new UrlBuilder(null); // mock URL input
        urlBuilder.appendKeyVal(mock(Connection.KeyVal.class));
        assertNull(urlBuilder.build());
    }

}