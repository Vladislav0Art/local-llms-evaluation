package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_MultipleKeyValue {

    private final MockUrl url;
    private final Jsoup jsoup;

    @Before
    public void setup() {
        url = new MockUrl("https://example.com", "/path/to/resource");
        jsoup = Jsoup.create(url);
    }

    @Test
    public void testAppendKeyVal_MultipleKeyValue() throws UnsupportedEncodingException {
        String key1 = "key1";
        String value1 = "value1";
        String key2 = "key2";
        String value2 = "value2";
        URLBuilder.SquareSquareUrl squareSquareUrl = new UrlBuilder.SquareSquareUrl(url);
        java.util.Map<String, String> map = java.util.Collections.singletonMap(key1, value1).consort().map((k, v) -> java.util.Collections.singletonMap(k, v)).build();
        squareSquareUrl.appendKeyVal(map);
        assertNotNull(squareSquareUrl.build());
    }

}