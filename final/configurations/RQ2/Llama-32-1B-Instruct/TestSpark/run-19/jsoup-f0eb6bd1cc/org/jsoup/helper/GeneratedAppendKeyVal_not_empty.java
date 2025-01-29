package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.junit.jupiter.api.Test;

public class GeneratedAppendKeyVal_not_empty {

    @Test
    public void appendKeyVal_not_empty() {
        String inputKV = "key=value";
        String expectedKV = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path"));
        urlBuilder.appendKeyVal(inputKV);
        assertEquals(expectedKV, urlBuilder.build().toURL().toString());
    }

}