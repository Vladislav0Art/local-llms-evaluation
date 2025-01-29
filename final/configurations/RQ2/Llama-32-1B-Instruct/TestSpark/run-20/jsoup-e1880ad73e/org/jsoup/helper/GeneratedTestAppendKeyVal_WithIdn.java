package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestAppendKeyVal_WithIdn {

    private UrlBuilder urlBuilder;

    @BeforeEach
    public void init() {
        urlBuilder = new UrlBuilder("http://example.com");
    }

    @Test
    public void testAppendKeyVal_WithIdn() {
        String key = "key";
        String value = "value";

        URI uri = Mockito.mock(URI.class);
        Mockito.when(uri.getScheme()).thenReturn("https");
        Mockito.when(uri.getHost()).thenReturn("example.com");
        Mockito.when(uri.getPath()).thenReturn("/path/to/resource");

        Mockito.when(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class))).thenCallRealMethod();
        urlBuilder.appendKeyVal(new Connection.KeyVal(key, value));
    }

}