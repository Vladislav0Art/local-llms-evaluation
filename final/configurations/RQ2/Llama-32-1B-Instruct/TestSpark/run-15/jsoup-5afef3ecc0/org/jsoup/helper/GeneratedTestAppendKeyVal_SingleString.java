package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_SingleString {

    private final MockUrl url;
    private final Jsoup jsoup;

    @Before
    public void setup() {
        url = new MockUrl("https://example.com", "/path/to/resource");
        jsoup = Jsoup.create(url);
    }

    @Test
    public void testAppendKeyVal_SingleString() throws UnsupportedEncodingException {
        String key = "key";
        byte[] value = "value".getBytes();
        URLBuilder.SquareSquareUrl squareSquareUrl = new UrlBuilder.SquareSquareUrl(url);
        squareSquareUrl.appendKeyVal(java.util.Map.Entry.of(key, java.nio.ByteBuffer.wrap(value)));
        assertNotNull(squareSquareUrl.build());
    }

}