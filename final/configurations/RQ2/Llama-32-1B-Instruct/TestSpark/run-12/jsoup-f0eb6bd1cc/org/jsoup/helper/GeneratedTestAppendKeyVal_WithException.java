package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestAppendKeyVal_WithException {

    @Test
    public void testAppendKeyVal_WithException() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        Mockito.when(Connection.KeyVal.encode(key)).thenReturn(value);

        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        boolean result = urlBuilder.appendKeyVal(new Connection.KeyVal<>(null, value));
        Assert.assertFalse(result);
    }

}