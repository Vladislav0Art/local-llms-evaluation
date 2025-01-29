package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedAppendKeyVal_NonEmptyValue {

    public String testUrl = "";

    public void appendKeyVal(String key) {
        this.testUrl += key + "=" + key + "&";
    }

    @Test
    public void appendKeyVal_NonEmptyValue() throws UnsupportedEncodingException {
        String encodedString = "key1=value1";
        UrlBuilderAppendKeyVal test = new UrlBuilderAppendKeyVal(encodedString);
        assertNotThrows(MalformedURLException.class, () -> test.appendKeyVal("value2"));
    }

}