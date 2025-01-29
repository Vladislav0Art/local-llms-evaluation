package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.KeyVal;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedTestAppendKeyVal_WithoutException {

    @Test
    public void testAppendKeyVal_WithoutException() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Mockito.when(urlBuilder.appendKeyVal(Mockito.any - KeyVal.class)).thenReturn(null);
        String key = "key";
        String value = "value";
        urlBuilder.appendKeyVal(key, value);
        assertEquals(key + "=" + value, DataUtil.encodeURLEncodedUrl(urlBuilder.build(), new String[]{key, value}));
    }

}