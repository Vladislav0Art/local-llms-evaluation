package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestAppendKeyVal_WithNull_Summary {

    private final UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

    @Test
    public void testAppendKeyVal_WithNull_Summary() {
        URLBuilder.AppendKeyValRequest request = mock(UrlBuilder.AppendKeyValRequest.class);
        nullValue = new HashMap<>();
        when(request.get Kv()).thenReturn(nullValue);
        String summary = urlBuilder.build().appendKeyVal(request).summary();
        assertEquals("null", summary);
    }

}