package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAppendKeyValEmptyKVAndNullKey {

    @Test
    public void testAppendKeyValEmptyKVAndNullKey() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        String[] emptyKV = {"", null};
        for (String kvValue : emptyKV) {
            assertNotNull(urlBuilder.appendKeyVal(kvValue, null));
        }
    }

}