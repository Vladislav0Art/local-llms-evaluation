package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestAppendKeyVal_WithMapAndString_Summary {

    private final UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

    @Test
    public void testAppendKeyVal_WithMapAndString_Summary() {
        URLBuilder.AppendKeyValRequest request = mock(UrlBuilder.AppendKeyValRequest.class);
        Map<String, Object> kv = new HashMap<>();
        kv.put("key", "value");
        when(request.get Kv()).thenReturn(kv);
        String summary = urlBuilder.build().appendKeyVal(request).summary();
        assertEquals("key=value", summary);
    }

}