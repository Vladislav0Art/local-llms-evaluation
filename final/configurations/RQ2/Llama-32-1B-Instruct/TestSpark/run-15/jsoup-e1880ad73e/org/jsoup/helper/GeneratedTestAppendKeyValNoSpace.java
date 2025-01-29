package org.jsoup.helper;

import org.junit.Test;

public class GeneratedTestAppendKeyValNoSpace {

    @Test
    public void testAppendKeyValNoSpace() {
        String key = "key";
        String value = "";
        String expected = "https://example.com/path?!" + key + "=" + value;
        UrlBuilder urlBuilder = new UrlBuilder(key, value);
        System.out.println(urlBuilder.appendKeyVal(key, value));
    }

}