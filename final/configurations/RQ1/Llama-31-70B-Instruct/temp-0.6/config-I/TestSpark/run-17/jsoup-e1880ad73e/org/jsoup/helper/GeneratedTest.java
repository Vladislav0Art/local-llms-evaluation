package org.jsoup.helper;

public class GeneratedTest {

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
    public void testBuild() {
        try {
            URL u = urlBuilder.build();
            assertEquals("http://xn--fsqu00a.xn--p1ai/", u.toString()); // Puny-code host
        } catch (Exception e) {
            fail("Exception thrown during test: " + e.getMessage());
        }
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