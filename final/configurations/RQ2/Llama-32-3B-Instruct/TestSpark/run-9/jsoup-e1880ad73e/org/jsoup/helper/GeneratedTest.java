package org.jsoup.helper;

public class GeneratedTest {

    private final String scheme;
    private final String path;
    private final String query;
    private final String fragment;

    public UrlBuilder(String scheme, String path) {
        this.scheme = scheme;
        this.path = path;
        this.query = "";
        this.fragment = "";
    }

    public UrlBuilder(String scheme, String path, String query) {
        this.scheme = scheme;
        this.path = path;
        this.query = query;
        this.fragment = "";
    }

    public UrlBuilder(String scheme, String path, String query, String fragment) {
        this.scheme = scheme;
        this.path = path;
        this.query = query;
        this.fragment = fragment;
    }

    public String getScheme() {
        return scheme;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public String getFragment() {
        return fragment;
    }
}

public class GeneratedTest {

}