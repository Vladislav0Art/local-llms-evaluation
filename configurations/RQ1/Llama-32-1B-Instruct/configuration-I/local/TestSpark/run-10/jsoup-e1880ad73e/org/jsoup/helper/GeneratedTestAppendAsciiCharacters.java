package org.jsoup.helper;

public class GeneratedTestAppendAsciiCharacters {

    private static final String BASE_URL = "http://example.com";

    @Test
    public void testAppendAsciiCharacters() {
        UrlBuilder builder = new UrlBuilder(BASE_URL);
        builder.appendKeyVal(new UrlBuilder.Value("key1", "value1"));
        String url = builder.build().toString();
        assert url.contains("%20");
    }

}