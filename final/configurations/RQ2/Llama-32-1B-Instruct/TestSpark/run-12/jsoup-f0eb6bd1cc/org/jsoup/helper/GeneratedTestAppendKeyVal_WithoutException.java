package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestAppendKeyVal_WithoutException {

    @Test
    public void testAppendKeyVal_WithoutException() {
        String key = "key";
        String value = "value";

        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        boolean result = urlBuilder.appendKeyVal(new Connection.KeyVal<>(key, value));
        Assert.assertTrue(result);
    }

}