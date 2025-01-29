package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestAppendKeyVal_MultipleQueriesQuiet_MultipleQueries_MissingValue {

    @Mock
    public static Connection.KeyVal mockKeyVal;

    @Test
    public void testAppendKeyVal_MultipleQueriesQuiet_MultipleQueries_MissingValue() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?a=1&b=");
        Map<String, String> kv = new HashMap<>();
        kv.put("a", "1");
        urlBuilder.appendKeyVal(kv);
        assertEquals("", urlBuilder.build().toString());
    }

}