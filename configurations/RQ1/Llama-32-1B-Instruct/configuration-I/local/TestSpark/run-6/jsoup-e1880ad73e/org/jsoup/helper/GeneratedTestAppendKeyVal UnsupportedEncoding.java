package org.jsoup.helper;

public class GeneratedTestAppendKeyVal UnsupportedEncoding {

}

/**
 * Test for UrlBuilder[appendKeyVal][Test].
 */
public class UrlBuilderAppendKeyValTest {

    @Test
    public void testAppendKeyVal

    UnsupportedEncoding() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?param=value");
        try {
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
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }
}

}