package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestAppendKeyVal_WithValidKeyValue {

    @Test
    public void testAppendKeyVal_WithValidKeyValue() {
        String key = "name";
        String value = "John Doe";
        when(keyVal.getKey()).thenReturn(key);
        when(value.getValue()).thenReturn(value);
        UrlBuilder urlBuilder = new UrlBuilder(null); // mock URL input
        urlBuilder.appendKeyVal(mock(Connection.KeyVal.class));
        assertNotNull(urlBuilder.build());
    }

}