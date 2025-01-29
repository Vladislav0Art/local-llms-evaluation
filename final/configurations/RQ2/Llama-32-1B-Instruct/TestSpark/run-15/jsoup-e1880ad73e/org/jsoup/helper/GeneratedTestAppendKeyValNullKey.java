package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAppendKeyValNullKey {

    @Test
    public void testAppendKeyValNullKey() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        String[] kvValues = {"param1=value1", "param2=value2"};
        for (String kvValue : kvValues) {
            assertNotNull(urlBuilder.appendKeyVal(null, kvValue));
        }
    }

}