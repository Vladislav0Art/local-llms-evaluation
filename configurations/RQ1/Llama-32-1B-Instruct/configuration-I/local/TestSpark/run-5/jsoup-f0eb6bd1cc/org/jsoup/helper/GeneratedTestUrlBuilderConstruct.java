package org.jsoup.helper;

public class GeneratedTestUrlBuilderConstruct {

    private UrlBuilder underTest;

    @Test
    public void testUrlBuilderConstruct() {
        String url = "https://example.com/path/to/resource";
        URLBuilder builder = new UrlBuilder(url);
        assert builder.u == null;
        assert builder.q == null;
        try {
            new UrlBuilder(url).build();
            fail("Expected a NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}