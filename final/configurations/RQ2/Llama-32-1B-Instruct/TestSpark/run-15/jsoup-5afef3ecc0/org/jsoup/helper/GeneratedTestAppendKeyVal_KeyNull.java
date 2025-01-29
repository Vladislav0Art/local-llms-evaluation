package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_KeyNull {

    private final MockUrl url;
    private final Jsoup jsoup;

    @Before
    public void setup() {
        url = new MockUrl("https://example.com", "/path/to/resource");
        jsoup = Jsoup.create(url);
    }

    @Test
    public void testAppendKeyVal_KeyNull() throws UnsupportedEncodingException {
        String key = null;
        URLBuilder.SquareSquareUrl squareSquareUrl = new UrlBuilder.SquareSquareUrl(url);
        squareSquareUrl.appendKeyVal(java.util.Map.Entry.of(key, "value"));
        assertNotNull(squareSquareUrl.build());
    }

}