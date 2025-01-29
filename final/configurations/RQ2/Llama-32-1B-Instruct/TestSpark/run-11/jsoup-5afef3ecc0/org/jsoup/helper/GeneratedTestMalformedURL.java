package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;

public class GeneratedTestMalformedURL {

    private static UrlBuilder urlBuilder = new UrlBuilder();

    @Test
    public void testMalformedURL() {
        URLBuilder.UrlBuilderTest(urlBuilder, null, "key2=value2");
        assertNull(urlBuilder.appendKeyVal(null));
    }
}

class UrlBuilder {

    public String appendKeyVal(String[] kvArray) {
        // build the url and return it
        // implement the logic here
        return "";
    }

    public void testBuild() {
        URLBuilder.UrlBuilderTest(this, "key1=value1", "key2=value2");
    }

}