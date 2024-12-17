package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NonNullableMap {

}

/**
 * Test for UrlBuilder[appendKeyVal][Test].
 */
public class UrlBuilderAppendKeyValTest {

    @Test
    public void testAppendKeyVal_NonNullableMap() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?param=value");
        urlBuilder.appendKeyVal(new org.jsoup.model.KeyVal() {
            @Override
            public String getKey() {
                return "key";
            }

            @Override
            public Object getValue() {
                return "value";
            }
        });
        assertEquals("https%3A%2F%2Fexample.com%2Fpath%3Fparam%3Dvalue", urlBuilder.getU());
    }
}

}