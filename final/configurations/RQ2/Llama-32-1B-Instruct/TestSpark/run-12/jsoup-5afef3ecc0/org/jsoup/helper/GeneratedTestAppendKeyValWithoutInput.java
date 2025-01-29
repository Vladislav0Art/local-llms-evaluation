package org.jsoup.helper;

import org.jsoup.helper.KeyVal;
import org.jsoup.helper.URLBuilder;
import org.junit.jupiter.api.BeforeEach;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestAppendKeyValWithoutInput {

    @BeforeEach
    public void setup() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyValWithoutInput() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal("key", "value");
        urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(kv);
        URL outputUrl = urlBuilder.build();
        assert !outputUrl.toString().isEmpty();
    }

}