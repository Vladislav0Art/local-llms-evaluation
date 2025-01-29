package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.KeyVal;
import org.jsoup.helper.UrlBuilderTestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Generated_0_05_createUrlWithNullInput {

    public final String INPUT_URL = "https://example.com";
    public static final org.jsoup.KeyVal KEY_VALUE_1 = new org.jsoup.KeyVal("key1=value1");
    public static final org.jsoup.KeyVal KEY_VALUE_2 = new org.jsoup.KeyVal("key2=value2");

    @BeforeEach
    public void setup() {
        UrlBuilder urlBuilder = new UrlBuilder();
    }

    @Test
    public void _0_05_createUrlWithNullInput() {
        try {
            new UrlBuilder(null);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // expected
        }
    }

}