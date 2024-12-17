package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestQuery {

    @Test
    public void testQuery() {
        String url = "http://example.com?param=value";
        new UrlBuilder().query(url).build();
    }
}

public class UrlBuilder {

    private StringBuilder builder;

    public UrlBuilder() {
        this.builder = new StringBuilder();
    }

    public UrlBuilder query(String url) {
        return (UrlBuilder) this;
    }

    public UrlBuilder append(String value) {
        builder.append(value);
        return this;
    }

    public String build() {
        return "http://example.com" + builder.toString();
    }
}

public class Validate {

    public static void assertFail(String message) {
        // implementation
    }

}