package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestAppendKeyVal_MultipleQueries_Quiet {

    @Mock
    public static Connection.KeyVal mockKeyVal;

    @Test
    public void testAppendKeyVal_MultipleQueries_Quiet() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?a=1&b=2&c=3&a=4");
        Map<String, String> kv = new HashMap<>();
        kv.put("a", "1");
        kv.put("b", "2");
        kv.put("c", "3");
        urlBuilder.appendKeyVal(kv);
        assertEquals("https://example.com/path?a%3D1&b%3D2&c%3D3&a%3D4", urlBuilder.build().toString());
    }

}