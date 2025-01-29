package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestAppendKeyVal_MissingKey {

    @Mock
    public static Connection.KeyVal mockKeyVal;

    @Test
    public void testAppendKeyVal_MissingKey() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?a=1&b=2");
        Map<String, String> kv = new HashMap<>();
        kv.put("c", "3");
        urlBuilder.appendKeyVal(kv);
        assertEquals("", urlBuilder.build().toString());
    }

}