package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;

public class GeneratedTestAppendKeyVal_MalformedURL {

    private static UrlBuilder urlBuilder = new UrlBuilder();

    @Test
    public void testAppendKeyVal_MalformedURL() throws Exception {
        URLBuilder.UrlBuilderTest(urlBuilder, null, "key2=value2");
        assertEquals(null, urlBuilder.appendKeyVal(null));
    }

    public String appendKeyVal(String[] kvArray) {
        return urlBuilder.appendKeyVal(kvArray);
    }
}

}