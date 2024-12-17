package org.jsoup.helper;

public class GeneratedTest_build_url_with_query {

    @Test
    public void test_build_url_with_query() {
        String url = "https://example.com/path/to/resource?param1=value1&param2=value2#anchor";
        UrlBuilder builder = new UrlBuilder(new URI("https://example.com"));
        builder.appendKeyVal(new KeyVal("param1", "value1"));
        builder.appendKeyVal(new KeyVal("param2", "value2"));
        URL urlObject = builder.build();
        assertEquals(url, urlObject.toString());
    }

}