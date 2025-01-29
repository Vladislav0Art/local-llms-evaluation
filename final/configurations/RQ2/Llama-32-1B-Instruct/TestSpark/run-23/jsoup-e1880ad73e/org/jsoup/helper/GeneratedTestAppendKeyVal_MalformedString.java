package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_MalformedString {

    private static String inputUrl;

    @Before
    public void setup() {
        // Nothing to set up, just for initialization
    }

    @Test
    public void testAppendKeyVal_MalformedString() {
        String key = "testKey";
        try {
            Connection.KeyVal kv = new Connection.KeyVal("test", "value");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl).appendKeyVal(kv);
            urlBuilder.build();
            // Should not fail, but for demonstration purposes:
            throw new Exception("Should have been thrown");
        } catch (Exception e) {
            assert false : "Should have thrown an exception";
        }
    }

}