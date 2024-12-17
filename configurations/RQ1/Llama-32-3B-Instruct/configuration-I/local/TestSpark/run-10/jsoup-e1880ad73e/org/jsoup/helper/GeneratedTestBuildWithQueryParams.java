package org.jsoup.helper;

public class GeneratedTestBuildWithQueryParams {

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
        // no port specified, so we don't add it to the url
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
    public void testBuildWithQueryParams() {
        UrlBuilder builder = new UrlBuilder("https://example.com", null);
        builder.withQueryParam("query", "value");
        String expectedUrl = "https://example.com?query=value";
        assertEquals(expectedUrl, builder.build());
    }

}