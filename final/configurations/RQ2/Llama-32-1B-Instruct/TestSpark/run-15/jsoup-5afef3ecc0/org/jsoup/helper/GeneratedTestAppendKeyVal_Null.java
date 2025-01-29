package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_Null {

    private final MockUrl url;
    private final Jsoup jsoup;

    @Before
    public void setup() {
        url = new MockUrl("https://example.com", "/path/to/resource");
        jsoup = Jsoup.create(url);
    }

    @Test
    public void testAppendKeyVal_Null() throws UnsupportedEncodingException {
        String key = null;
        byte[] value = new byte[0];
        URLBuilder.SquareSquareUrl squareSquareUrl = new UrlBuilder.SquareSquareUrl(url);
        squareSquareUrl.appendKeyVal(java.util.Map.Entry.of(key, java.nio.ByteBuffer.wrap(value)));
        assertNotNull(squareSquareUrl.build());
    }
}

class MockUrl {
    private String scheme;
    private String resource;

    public MockUrl(String scheme, String resource) {
        this.scheme = scheme;
        this.resource = resource;
    }

    public String getScheme() {
        return scheme;
    }

    public String getResource() {
        return resource;
    }
}

interface UrlBuilder {
    URL build();
}

class SquareSquareUrl implements UrlBuilder {
    private final MockUrl mockUrl;

    public SquareSquareUrl(MockUrl mockUrl) {
        this.mockUrl = mockUrl;
    }

    @Override
    public URL build() {
        return Jsoup.connect(mockUrl.resource()).get();
    }

}