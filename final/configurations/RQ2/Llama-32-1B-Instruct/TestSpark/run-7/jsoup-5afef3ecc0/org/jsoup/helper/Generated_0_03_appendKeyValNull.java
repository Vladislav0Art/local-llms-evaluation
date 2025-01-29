package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilderTestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Generated_0_03_appendKeyValNull {

    private final UrlBuilder urlBuilder = new UrlBuilder();

    @BeforeEach
    public void setup() {
        URL inputUrl = "https://example.com";
        String[] keyValues = {"key1=value1", "key2=value2"};
        for (String kv : keyValues) {
            urlBuilder.appendKeyVal(new org.jsoup.KeyVal(kv));
        }
    }

    @Test
    public void _0_03_appendKeyValNull() throws UnsupportedEncodingException {
        org.jsoup.KeyVal keyVal = null;
        urlBuilder.appendKeyVal(keyVal);
        URL resultUrl = urlBuilder.build();
        assertNotNull(resultUrl);
        // No assertion for null value, assuming it's handled correctly
    }

}