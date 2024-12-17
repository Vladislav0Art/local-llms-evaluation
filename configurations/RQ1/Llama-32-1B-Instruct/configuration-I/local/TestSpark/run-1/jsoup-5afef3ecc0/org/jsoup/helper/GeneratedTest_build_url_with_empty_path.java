package org.jsoup.helper;

public class GeneratedTest_build_url_with_empty_path {

    @Test
    public void test_build_url_with_empty_path() {
        String url = "https://example.com/path/to/resource";
        UrlBuilder builder = new UrlBuilder(new URI("http://example.com"));
        builder.appendKeyVal(new KeyVal("param1", "value1"));
        builder.appendKeyVal(new KeyVal("param2", "value2"));
        builder.appendRef(null);
        URL urlObject = builder.build();
        assertEquals(url, urlObject.toString());
    }

}