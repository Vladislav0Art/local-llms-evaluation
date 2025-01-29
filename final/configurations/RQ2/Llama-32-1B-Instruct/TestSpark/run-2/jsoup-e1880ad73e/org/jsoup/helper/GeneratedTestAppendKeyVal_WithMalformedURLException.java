package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.KeyVal;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedTestAppendKeyVal_WithMalformedURLException {

    @Test
    public void testAppendKeyVal_WithMalformedURLException() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Mockito.when(urlBuilder.appendKeyVal(Mockito.any(KeyVal.class))).thenThrow(MalformedURLException.class);
        KeyVal key = "key";
        String value = "value";
        Mockito.when(mock -> urlBuilder.appendKeyVal(key, value)).thenReturn(null);
        urlBuilder.appendKeyVal(key, value);
        assertEquals(value, DataUtil.encodeURLEncodedUrl(urlBuilder.build(), new String[]{key}));
    }

}