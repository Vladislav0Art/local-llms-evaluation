package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedAppendKeyVal_MalformedKey {

    public String testUrl = "";

    public void appendKeyVal(String key) {
        this.testUrl += key + "=" + key + "&";
    }

    @Test
    public void appendKeyVal_MalformedKey() throws UnsupportedEncodingException {
        UrlBuilderAppendKeyVal test = new UrlBuilderAppendKeyVal();
        assertThrows(MalformedURLException.class, () -> test.appendKeyVal("invalid-key"));
    }
}

}