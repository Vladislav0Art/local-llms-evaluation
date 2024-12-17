package org.jsoup.helper;

public class GeneratedTest_build_url {

    @Test
    public void test_build_url() {
        String url = "https://example.com/path/to/resource?param1=value1&param2=value2";
        URLBuilder builder = new UrlBuilder(new URI("https://example.com"));
        URL urlObject = builder.build();
        assertEquals(url, urlObject.toString());
    }

}