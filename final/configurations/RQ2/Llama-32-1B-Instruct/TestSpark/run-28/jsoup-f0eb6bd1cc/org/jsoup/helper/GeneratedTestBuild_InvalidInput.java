package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestBuild_InvalidInput {

    @Test
    public void testBuild_InvalidInput() throws UnsupportedEncodingException {
        String url = null;
        URL result = UrlBuilder.build(url);
        assertNull(result); // Expecting a NullPointerException
    }

}