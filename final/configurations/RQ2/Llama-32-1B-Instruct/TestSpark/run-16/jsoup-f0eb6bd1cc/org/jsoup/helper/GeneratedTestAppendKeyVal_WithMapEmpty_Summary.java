package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestAppendKeyVal_WithMapEmpty_Summary {

    private final UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

    @Test
    public void testAppendKeyVal_WithMapEmpty_Summary() {
        URLBuilder.AppendKeyValRequest request = mock(UrlBuilder.AppendKeyValRequest.class);
        Map<String, Object> kv = new HashMap<>();
        when(request.get Kv()).thenReturn(kv);
        String summary = urlBuilder.build().appendKeyVal(request).summary();
        assertEquals("{}", summary);
    }

    private void assertNullValue(HashMap<String, Object> map) {
        if (map != null) {
            throw new AssertionError("map is not null");
        }
    }

}