package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestBuild_WithNullInputUrl {

    @Test
    public void testBuild_WithNullInputUrl() {
        String key = "key";
        String value = "value";

        UrlBuilder urlBuilder = new UrlBuilder(null);

        boolean result = urlBuilder.build().toString().equals("null");
        Assert.assertFalse(result);
    }

}