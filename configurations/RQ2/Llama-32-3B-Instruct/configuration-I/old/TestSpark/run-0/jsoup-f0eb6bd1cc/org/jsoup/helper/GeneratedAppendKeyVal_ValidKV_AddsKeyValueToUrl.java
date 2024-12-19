package org.jsoup.helper;

public class GeneratedAppendKeyVal_ValidKV_AddsKeyValueToUrl {

    private UrlBuilder urlBuilder;

    @BeforeClass
    public static void setup() {
        // Initialize mocks here
    }

    public UrlBuilder getURLBuilder() {
        return new UrlBuilder(new URL("https://example.com"));
    }

    @Test
    public void appendKeyVal_ValidKV_AddsKeyValueToUrl() {
        String url = "https://example.com";
        when(urlBuilder.inputUrl.toString()).thenReturn(url);
        urlBuilder.appendKeyVal(Connection.KeyVal.of("key", "value"));
        URL result = urlBuilder.build();
        assertEquals("https://example.com?key=value", result.toString());
    }

}