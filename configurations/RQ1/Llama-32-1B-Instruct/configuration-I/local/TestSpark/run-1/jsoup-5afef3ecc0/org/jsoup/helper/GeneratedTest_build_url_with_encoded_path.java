package org.jsoup.helper;

public class GeneratedTest_build_url_with_encoded_path {

    @Test
    public void test_build_url_with_encoded_path() {
        String url = "https://example.com/path/to/resource?param1=value1&param2=value2";
        UrlBuilder builder = new UrlBuilder(new URI("http://example.com"));
        builder.appendKeyVal(new KeyVal("param1", "value1"));
        builder.appendKeyVal(new KeyVal("param2", "value2"));
        String encodedPath = decodePart(building.build().getPath());
        assertEquals(encodedPath, "https%3A%2F%2Fexample.com%2Fpath%2Fto%2Fresource?param1=value1&param2=value2");
    }

}