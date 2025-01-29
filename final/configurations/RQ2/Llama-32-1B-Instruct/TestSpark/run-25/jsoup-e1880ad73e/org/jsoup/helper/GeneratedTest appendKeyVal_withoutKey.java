package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest appendKeyVal_withoutKey {

    @Test
    public void test

    appendKeyVal_withoutKey() throws UnsupportedEncodingException {
        String key = "";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(value);
        URL url = builder.build();
        assertEquals(DataUtil.UTF_8.toString(), url.toString());
    }

}