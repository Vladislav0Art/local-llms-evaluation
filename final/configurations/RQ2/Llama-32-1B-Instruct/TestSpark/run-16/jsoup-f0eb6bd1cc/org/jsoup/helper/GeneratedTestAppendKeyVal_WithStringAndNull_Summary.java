package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestAppendKeyVal_WithStringAndNull_Summary {

    private final UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

    @Test
    public void testAppendKeyVal_WithStringAndNull_Summary() {
        URLBuilder.AppendKeyValRequest request = mock(UrlBuilder.AppendKeyValRequest.class);
        String s = "hello";
        when(request.get S()).thenReturn(s);
        try {
            urlBuilder.build().appendKeyVal(request).summary();
            assert false;
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}