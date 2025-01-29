package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestAppendKeyVal_WithStringAndString_Summary {

    private final UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

    @Test
    public void testAppendKeyVal_WithStringAndString_Summary() {
        URLBuilder.AppendKeyValRequest request = mock(UrlBuilder.AppendKeyValRequest.class);
        String s = "hello";
        when(request.get S()).thenReturn(s);
        String summary = urlBuilder.build().appendKeyVal(request).summary();
        assertEquals("hello", summary);
    }

}