package org.jsoup.helper;

public class GeneratedTest {

    private String url;
    private String path;
    private String query;

    public UrlBuilder(String url) {
        this.url = url;
    }

    public UrlBuilder withPath(String path) {
        this.path = path;
        return this;
    }

    public UrlBuilder withQueryParam(String key, String value) {
        if (query == null) {
            query = key + "=" + value;
        } else {
            if (!query.contains(";")) {
                query += ";";
            }
            query += key + "=" + value;
        }
        return this;
    }

    public UrlBuilder withPort(int port) {
        if (url.contains(":")) {
            url += ":" + port;
        }
        return this;
    }

    public String build() {
        StringBuilder sb = new StringBuilder(url);
        if (path != null && !path.isEmpty()) {
            sb.append("/").append(path);
        }
        if (query != null && !query.isEmpty()) {
            sb.append("?").append(query);
        }
        return sb.toString();
    }

    public String getQuery() {
        return query;
    }
}

public class UrlBuilderTest {

    @Test
    public void testMalformedURLException() {
        UrlBuilder builder = new UrlBuilder(null);
        assertThrows(MalformedURLException.class, () -> builder.build());
    }
}

class UrlBuilder {
    private String url;
    private String path;
    private String query;
    private int port;

    public UrlBuilder(String url) {
        this.url = url;
    }

    public UrlBuilder withPath(String path) {
        this.path = path;
        return this;
    }

    public UrlBuilder withQuery(String query, String value) {
        this.query = query + "=" + value;
        return this;
    }

    public UrlBuilder withPort(int port) {
        this.port = port;
        return this;
    }

    public String build() {
        StringBuilder sb = new StringBuilder(url);
        if (path != null && !path.isEmpty()) {
            sb.append("/").append(path);
        }
        if (query != null && !query.isEmpty()) {
            sb.append("?").append(query);
        }
        if (port > 0) {
            sb.append(":").append(port);
        }
        return sb.toString();
    }
}

class MalformedURLException extends Exception {
    public MalformedURLException(String message) {
        super(message);
    }

}