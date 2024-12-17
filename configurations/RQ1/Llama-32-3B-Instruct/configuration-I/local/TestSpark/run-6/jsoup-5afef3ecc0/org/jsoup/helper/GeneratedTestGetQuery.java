package org.jsoup.helper;

public class GeneratedTestGetQuery {

    private URL url;

    public UrlBuilder(URL url) throws MalformedURLException {
        if (url == null) {
            throw new MalformedURLException("URL cannot be null");
        }
        this.url = url;
    }

    public String getQuery() throws MalformedURLException {
        return new StringBuilder(url.getQuery()).toString();
    }

    public static UrlBuilder newUrlBuilder(URL url) throws MalformedURLException {
        if (url == null) {
            throw new MalformedURLException("URL cannot be null");
        }
        return new UrlBuilder(url);
    }
}

public class TestUrlBuilder {

    @Test
    public void testGetQuery() throws MalformedURLException {
        String url = "http://example.com/path?key1=value1&key2=value2";
        UrlBuilder builder = UrlBuilder.newUrlBuilder(new URL(url));
        assertEquals("?key1=value1&key2=value2", builder.getQuery());
    }

}