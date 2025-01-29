package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.KeyVal;
import org.jsoup.helper.UrlBuilderTestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    public final String INPUT_URL = "https://example.com";
    public static final org.jsoup.KeyVal KEY_VALUE_1 = new org.jsoup.KeyVal("key1=value1");
    public static final org.jsoup.KeyVal KEY_VALUE_2 = new org.jsoup.KeyVal("key2=value2");

    @BeforeEach
    public void setup() {
        UrlBuilder urlBuilder = new UrlBuilder();
    }

    @Test
    public void _0_01_build() throws UnsupportedEncodingException {
        URL resultUrl = urlBuilder.build(INPUT_URL);
        assertNotNull(resultUrl);
        assertEquals(INPUT_URL, DataUtil.decode(resultUrl.toString(), "UTF-8"));
    }

    @Test
    public void _0_02_appendKeyVal() throws UnsupportedEncodingException {
        org.jsoup.KeyVal keyVal = new org.jsoup.KeyVal(KEY_VALUE_1.getKey());
        urlBuilder.appendKeyVal(keyVal);
        URL resultUrl = urlBuilder.build();
        assertNotNull(resultUrl);
        assertEquals(INPUT_URL, DataUtil.decode(resultUrl.toString(), "UTF-8"));
    }

    @Test
    public void _0_03_appendKeyVal_null() throws UnsupportedEncodingException {
        org.jsoup.KeyVal keyVal = null;
        urlBuilder.appendKeyVal(keyVal);
        URL resultUrl = urlBuilder.build();
        assertNotNull(resultUrl);
        assertEquals(INPUT_URL, DataUtil.decode(resultUrl.toString(), "UTF-8"));
    }

    @Test
    public void _0_04_appendMultipleKeyVals() throws UnsupportedEncodingException {
        org.jsoup.KeyVal key1 = new org.jsoup.KeyVal(KEY_VALUE_1.getKey());
        org.jsoup.KeyVal key2 = new org.jsoup.KeyVal(KEY_VALUE_2.getKey());
        urlBuilder.appendKeyVal(key1);
        urlBuilder.appendKeyVal(key2);
        URL resultUrl = urlBuilder.build();
        assertNotNull(resultUrl);
        assertEquals(INPUT_URL, DataUtil.decode(resultUrl.toString(), "UTF-8"));
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