package org.jsoup.helper;

public class GeneratedTest {

    private String path;
    private String query;

    public static Response of() {
        return new Response();
    }

    public Response setPath(String path) {
        this.path = path;
        return this;
    }

    public Response setQuery(String query) {
        if (query != null) {
            this.query += "?" + query;
        }
        return this;
    }

    public void printResponse() {
        System.out.println("Path: " + path);
        System.out.println("Query: " + query);
    }
}

public class Main {

}