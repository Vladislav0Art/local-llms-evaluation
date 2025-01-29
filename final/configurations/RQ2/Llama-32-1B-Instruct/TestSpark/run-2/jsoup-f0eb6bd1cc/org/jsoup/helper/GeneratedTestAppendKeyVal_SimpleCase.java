package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestAppendKeyVal_SimpleCase {

    @Mock
    public static Connection.KeyVal mockKeyVal;

    @Test
    public void testAppendKeyVal_SimpleCase() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?a=1&b=2");
        Map<String, String> kv = new HashMap<>();
        kv.put("a", "1");
        kv.put("b", "2");
        urlBuilder.appendKeyVal(kv);
        assertEquals("https://example.com/path?a%3D1&b%3D2", urlBuilder.build().toString());
    }

}