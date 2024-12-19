package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_MalformedKey {

    private UrlBuilder urlBuilder;

    @Before
    void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyVal_MalformedKey() {
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
            // expected
        }
    }

}