package org.jsoup.helper;

public class GeneratedTest {

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

}