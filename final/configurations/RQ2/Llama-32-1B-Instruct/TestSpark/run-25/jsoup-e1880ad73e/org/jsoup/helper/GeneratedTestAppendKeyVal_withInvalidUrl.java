package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_withInvalidUrl {

    @Test
    public void testAppendKeyVal_withInvalidUrl() throws UnsupportedEncodingException {
        String inputUrl = "http://example.com/path/to/resource invalid/url";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL url = builder.build();
        assertEquals(DataUtil.UTF_8.toString(), url.toString());
    }

}