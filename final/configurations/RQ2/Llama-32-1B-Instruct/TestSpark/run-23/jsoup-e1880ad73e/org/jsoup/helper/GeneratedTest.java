package org.jsoup.helper;

public class GeneratedTest {

    private static String inputUrl;

    @Before
    public void setup() {
        // Nothing to set up, just for initialization
    }

    @Test
    public void testBuild_WhenInputIsNull() {
        assertNotNull(inputUrl);
        Url url = new UrlBuilder(null).build();
        assert url == null;
    }

    @Test
    public void testBuild_EmptyString() {
        inputUrl = "";
        URL url = new UrlBuilder(inputUrl).build();
        assert url == null;
    }

    @Test
    public void testBuild_FromEmptyString() {
        inputUrl = "https://example.com";
        URL url = new UrlBuilder(inputUrl).build();
        assert url != null;
    }

    @Test
    public void testAppendKeyVal_NoException() {
        String key = "testKey";
        String value = "testValue";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl).appendKeyVal(kv);
        URL url = urlBuilder.build();
        assertNotNull(url);
    }

    @Test
    public void testAppendKeyVal_NullException() {
        String key = "testKey";
        try {
            Connection.KeyVal kv = null;
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl).appendKeyVal(kv);
            urlBuilder.build();
            // Should not fail, but for demonstration purposes:
            throw new Exception("Should have been thrown");
        } catch (Exception e) {
            assert false : "Should have thrown an exception";
        }
    }

    @Test
    public void testAppendKeyVal_SpecificException() {
        String key = "testKey";
        try {
            Connection.KeyVal kv = new Connection.KeyVal("not a key", "not a value");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl).appendKeyVal(kv);
            urlBuilder.build();
            // Should not fail, but for demonstration purposes:
            throw new Exception("Should have been thrown");
        } catch (Exception e) {
            assert false : "Should have thrown an exception";
        }
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

    @Test
    public void testAppendKeyVal_MalformedURI() {
        String key = "testKey";
        try {
            Connection.KeyVal kv = new Connection.KeyVal("https://example.com", "");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl).appendKeyVal(kv);
            urlBuilder.build();
            // Should not fail, but for demonstration purposes:
            throw new Exception("Should have been thrown");
        } catch (Exception e) {
            assert false : "Should have thrown an exception";
        }
    }

}