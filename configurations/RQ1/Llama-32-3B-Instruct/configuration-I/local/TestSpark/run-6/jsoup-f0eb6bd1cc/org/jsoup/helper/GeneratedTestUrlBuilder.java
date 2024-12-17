package org.jsoup.helper;

public class GeneratedTestUrlBuilder {

    private StringBuilder path = new StringBuilder();
    private String query;

    public UrlBuilder setPath(String path) {
        this.path.append(path).append("/");
        return this;
    }

    public UrlBuilder setQuery(String query) {
        if (query != null) {
            this.query += "?" + query;
        }
        return this;
    }

    public void build() {
        String url = "http://" + path.toString().substring(0, path.length() - 1);
        System.out.println(url + query);
    }
}

public class Response {
    private String path;
    private String query;

    public Response setPath(String path) {
        this.path = path;
        return this;
    }

    public Response setQuery(String query) {
        if (query != null) {
            this.query = "?" + query;
        }
        return this;
    }

    public void printResponse() {
        System.out.println("Path: " + path);
        System.out.println("Query: " + query);
    }
}

public class Main {

    @Test
    public void testUrlBuilder() {
        UrlBuilder builder = new UrlBuilder();
        builder.setPath("/path");
        builder.setQuery("query");
        builder.build();
    }

}