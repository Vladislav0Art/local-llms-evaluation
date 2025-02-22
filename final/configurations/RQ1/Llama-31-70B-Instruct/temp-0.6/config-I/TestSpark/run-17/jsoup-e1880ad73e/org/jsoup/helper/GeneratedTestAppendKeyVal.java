package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        URL inputUrl = null;
        try {
            inputUrl = new URL("http://example.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void testAppendKeyVal() {
        try {
            Connection.KeyVal kv = new Connection.KeyVal("key", "value");
            urlBuilder.appendKeyVal(kv);
            assertEquals("key=value", urlBuilder.q.toString());
        } catch (Exception e) {
            fail("Exception thrown during test: " + e.getMessage());
        }
    }

}