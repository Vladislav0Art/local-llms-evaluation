package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_EmptyMap {

    private final MockUrl url;
    private final Jsoup jsoup;

    @Before
    public void setup() {
        url = new MockUrl("https://example.com", "/path/to/resource");
        jsoup = Jsoup.create(url);
    }

    @Test
    public void testAppendKeyVal_EmptyMap() throws UnsupportedEncodingException {
        URLBuilder.SquareSquareUrl squareSquareUrl = new UrlBuilder.SquareSquareUrl(url);
        squareSquareUrl.appendKeyVal(java.util.Collections.emptyList());
        assertNotNull(squareSquareUrl.build());
    }

}