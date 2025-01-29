package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.junit.jupiter.api.Test;

public class GeneratedAppendKeyVal_empty {

    @Test
    public void appendKeyVal_empty() {
        String inputKV = "";
        String expectedKV = "";
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path"));
        urlBuilder.appendKeyVal(inputKV);
        assertEquals(expectedKV, urlBuilder.build().toURL().toString());
    }

}