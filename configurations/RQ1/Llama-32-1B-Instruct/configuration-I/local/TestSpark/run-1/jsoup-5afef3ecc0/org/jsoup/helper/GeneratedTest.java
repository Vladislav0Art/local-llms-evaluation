package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void test_build_url() {
        String url = "https://example.com/path/to/resource?param1=value1&param2=value2";
        URLBuilder builder = new UrlBuilder(new URI("https://example.com"));
        URL urlObject = builder.build();
        assertEquals(url, urlObject.toString());
    }

    @Test
    public void test_build_url_with_ref() {
        String url = "https://example.com/path/to/resource?param1=value1&param2=value2#anchor";
        UrlBuilder builder = new UrlBuilder(new URI("https://example.com"));
        URL urlObject = builder.build();
        assertEquals(url, urlObject.toString());
    }

    @Test
    public void test_build_url_with_query() {
        String url = "https://example.com/path/to/resource?param1=value1&param2=value2#anchor";
        UrlBuilder builder = new UrlBuilder(new URI("https://example.com"));
        builder.appendKeyVal(new KeyVal("param1", "value1"));
        builder.appendKeyVal(new KeyVal("param2", "value2"));
        URL urlObject = builder.build();
        assertEquals(url, urlObject.toString());
    }

    @Test
    public void test_build_url_with_encoded_query() {
        String url = "https://example.com/path/to/resource?param1=value1&param2=value2";
        UrlBuilder builder = new UrlBuilder(new URI("https://example.com"));
        builder.appendKeyVal(new KeyVal("param1", "value1"));
        builder.appendKeyVal(new KeyVal("param2", "value2"));
        builder.appendKeyVal(new KeyVal("key=20", "val=30"));
        URL urlObject = builder.build();
        assertEquals(url, urlObject.toString());
    }

    @Test
    public void test_build_url_with_empty_query() {
        String url = "https://example.com/path/to/resource";
        UrlBuilder builder = new UrlBuilder(new URI("https://example.com"));
        builder.appendKeyVal(new KeyVal("param1", "value1"));
        builder.appendKeyVal(new KeyVal("param2", "value2"));
        URL urlObject = builder.build();
        assertEquals(url, urlObject.toString());
    }

    @Test
    public void test_build_url_with_empty_ref() {
        String url = "https://example.com/path/to/resource";
        UrlBuilder builder = new UrlBuilder(new URI("https://example.com"));
        builder.appendKeyVal(new KeyVal("param1", "value1"));
        builder.appendKeyVal(new KeyVal("param2", "value2"));
        builder.appendRef(null);
        URL urlObject = builder.build();
        assertEquals(url, urlObject.toString());
    }

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