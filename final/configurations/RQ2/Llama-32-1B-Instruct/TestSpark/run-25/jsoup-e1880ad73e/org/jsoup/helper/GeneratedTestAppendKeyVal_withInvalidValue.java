package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_withInvalidValue {

    @Test
    public void testAppendKeyVal_withInvalidValue() throws UnsupportedEncodingException {
        String key = "key";
        String value = null;
        UrlBuilder builder = new UrlBuilder(key, value);
        URL url = builder.build();
        assertEquals(DataUtil.UTF_8.toString(), url.toString());
    }

}