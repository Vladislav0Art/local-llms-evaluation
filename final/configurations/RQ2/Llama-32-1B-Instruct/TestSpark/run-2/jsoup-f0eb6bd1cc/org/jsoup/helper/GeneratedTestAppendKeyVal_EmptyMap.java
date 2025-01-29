package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestAppendKeyVal_EmptyMap {

    @Mock
    public static Connection.KeyVal mockKeyVal;

    @Test
    public void testAppendKeyVal_EmptyMap() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        Map<String, String> kv = new HashMap<>();
        urlBuilder.appendKeyVal(kv);
        assertEquals("", urlBuilder.build().toString());
    }

}