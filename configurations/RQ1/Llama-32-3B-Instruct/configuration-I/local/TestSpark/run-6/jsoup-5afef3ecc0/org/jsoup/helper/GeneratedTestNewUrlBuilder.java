package org.jsoup.helper;

public class GeneratedTestNewUrlBuilder {

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
    public void testNewUrlBuilder() throws MalformedURLException {
        String url = "http://example.com/path";
        URL inputUrl = new URL(url);
        UrlBuilder builder = UrlBuilder.newUrlBuilder(inputUrl);
        assertThrows(MalformedURLException.class, () -> UrlBuilder.newUrlBuilder(null));
    }
}

}