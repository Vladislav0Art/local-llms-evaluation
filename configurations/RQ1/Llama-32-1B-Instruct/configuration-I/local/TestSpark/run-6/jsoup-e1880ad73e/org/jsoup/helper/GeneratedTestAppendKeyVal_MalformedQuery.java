package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_MalformedQuery {

}

/**
 * Test for UrlBuilder[appendKeyVal][Test].
 */
public class UrlBuilderAppendKeyValTest {

    @Test
    public void testAppendKeyVal_MalformedQuery() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?param=value#anchor");
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
        assertEquals(null, urlBuilder.getU());
    }
}

}