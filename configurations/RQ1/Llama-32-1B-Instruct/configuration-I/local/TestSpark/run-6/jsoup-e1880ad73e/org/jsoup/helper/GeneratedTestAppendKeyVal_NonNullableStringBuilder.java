package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NonNullableStringBuilder {

}

/**
 * Test for UrlBuilder[appendKeyVal][Test].
 */
public class UrlBuilderAppendKeyValTest {

    @Test
    public void testAppendKeyVal_NonNullableStringBuilder() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?param=value");
        StringBuilder sb = new StringBuilder();
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
        assertEquals("https%3A%2F%2Fexample.com%2Fpath%3Fparam%3Dvalue", sb.toString());
    }
}

}