package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_InvalidMap {

    private final MockUrl url;
    private final Jsoup jsoup;

    @Before
    public void setup() {
        url = new MockUrl("https://example.com", "/path/to/resource");
        jsoup = Jsoup.create(url);
    }

    @Test
    public void testAppendKeyVal_InvalidMap() throws UnsupportedEncodingException {
        String key = "key";
        byte[] value = new byte[0];
        URLBuilder.SquareSquareUrl squareSquareUrl = new UrlBuilder.SquareSquareUrl(url);
        squareSquareUrl.appendKeyVal(java.util.Map.Entry.of(key, java.nio.ByteBuffer.wrap(value)));
        assertNotNull(squareSquareUrl.build());
    }

}