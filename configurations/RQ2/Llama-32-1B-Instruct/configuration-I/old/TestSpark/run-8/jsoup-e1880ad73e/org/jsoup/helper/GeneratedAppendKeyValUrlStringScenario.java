package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.URLBuilder;
import org.jsoup.util.URLUtils;

public class GeneratedAppendKeyValUrlStringScenario {

    @Mock
    private URL url;

    @Test
    public void appendKeyValUrlStringScenario() throws UnsupportedEncodingException {
        final String urlString = "https://example.com/path?key=1&value=2";
        when(url.toString()).thenReturn(urlString);
        UrlBuilder urlBuilder = new UrlBuilder(url);
        List<URL.KeyValue> keyValuePairs = List.of(
                new URL.KeyValue("key", "1"),
                new URL.KeyValue("value", "2")
        );
        urlBuilder.appendKeyVal(keyValuePairs);
        String resultUrl = (String) urlBuilder.build();
        assertEquals(urlString, resultUrl);
    }

}