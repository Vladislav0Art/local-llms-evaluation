package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.junit.jupiter.api.Test;

public class GeneratedAppendKeyVal_missing {

    @Test
    public void appendKeyVal_missing() {
        String inputKV = "key=value";
        String expectedKV = null;
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path"));
        urlBuilder.appendKeyVal(inputKV);
        assert null == urlBuilder.build().toURL().toString();
    }

}