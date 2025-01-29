package org.jsoup.helper;

import org.jsoup.helper.KeyVal;
import org.jsoup.helper.URLBuilder;
import org.junit.jupiter.api.BeforeEach;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestAppendKeyValWithInputUrl {

    @BeforeEach
    public void setup() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyValWithInputUrl() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        KeyVal kv = new KeyVal(key, value);
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path?query=value#fragment");
        urlBuilder.appendKeyVal(kv);
        URL outputUrl = urlBuilder.build();
        assert !outputUrl.toString().isEmpty();
    }

}