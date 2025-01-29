package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAppendKeyValNullString {

    @Test
    public void testAppendKeyValNullString() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        String[] emptyKV = {"", "a"};
        for (String kvValue : emptyKV) {
            assertNull(urlBuilder.appendKeyVal(kvValue, null));
        }
    }

}