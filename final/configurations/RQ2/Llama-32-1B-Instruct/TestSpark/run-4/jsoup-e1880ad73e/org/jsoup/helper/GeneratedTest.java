package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void buildUrl_CorrectScenario() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URL expectedUrl = new URI("https://example.com/path").toURL();
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void appendKeyVal_NoEmptyKeyScenario() {
        String inputKey = "test";
        String inputValue = "123";
        Connection.KeyVal kv = new Connection.KeyVal(inputKey, inputValue);
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);
        URL actualUrl = urlBuilder.build();
        assertEquals("https://example.com/path?test=123", actualUrl.toString());
    }

    @Test
    public void appendKeyVal_EmptyKeyValueScenario() {
        String inputKey = "test";
        Connection.KeyVal kv = new Connection.KeyVal(inputKey, "");
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);
        URL actualUrl = urlBuilder.build();
        assertEquals("https://example.com/path?test=", actualUrl.toString());
    }

    @Test
    public void appendKeyVal_DifferentKeysScenario() {
        String inputKey1 = "test1";
        String inputValue1 = "123";
        String inputKey2 = "test2";
        String inputValue2 = "456";
        Connection.KeyVal kv1 = new Connection.KeyVal(inputKey1, inputValue1);
        Connection.KeyVal kv2 = new Connection.KeyVal(inputKey2, inputValue2);
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        URL actualUrl = urlBuilder.build();
        assertEquals("https://example.com/path?test1=123&test2=456", actualUrl.toString());
    }

    @Test
    public void buildUrl_InvalidScenario() {
        try {
            new UrlBuilder("https://example.com/path? invalid key");
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

    @Test
    public void appendKeyVal_NullKeyScenario() {
        String inputKey = null;
        Connection.KeyVal kv = new Connection.KeyVal(inputKey, "");
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);
        try {
            URL actualUrl = urlBuilder.build();
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

}