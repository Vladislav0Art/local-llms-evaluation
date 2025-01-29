package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testDefaultConstructor() {
        assertEquals(1, UrlBuilder.class.getProtectionDomain().getDeclaredFields().length);
    }

    @Test
    public void testToString() {
        String url = "https://www.example.com";
        assertTrue(UrlBuilder.toString(url).contains("https"));
    }

    @Test
    public void testConstructorFromString() {
        UrlBuilder builder = new UrlBuilder("https://www.example.com");
        assertEquals(builder, UrlBuilder.fromUri(builder.uri));
    }

    @Test
    public void testConstructorsWithParams() {
        String url = "https://www.example.com?param1=value1&param2=value2";
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder);
        assertEquals("https", builder.uri());
        assertTrue(builder.params().containsKey("param1"));
        assertTrue(builder.params().containsKey("param2"));
    }

    @Test
    public void testConstructorsWithQueryParams() {
        String url = "https://www.example.com?query1=value1&query2=value2";
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder);
        assertEquals("https", builder.uri());
        assertTrue(builder.queryParams().containsKey("query1"));
        assertTrue(builder.queryParams().containsKey("query2"));
    }

    @Test
    public void testConstructorsWithQueryParamsAndParams() {
        String url = "https://www.example.com?query1=value1&param1=value1&param2=value2";
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder);
        assertEquals("https", builder.uri());
        assertTrue(builder.queryParams().containsKey("query1"));
        assertTrue(builder.params().containsKey("param1"));
        assertTrue(builder.params().containsKey("param2"));
    }

    @Test
    public void testConstructorsWithEncoding() {
        String url = "https://www.example.com?encoding=ISO-8859-1&lang=en";
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder);
        assertEquals("https", builder.uri());
        assertTrue(builder.encoding().equals("ISO-8859-1"));
        assertTrue(builder.language().equals("en"));
    }

    @Test
    public void testConstructorsWithUnknownError() {
        try {
            new UrlBuilder("https://www.example.com");
        } catch (Exception e) {
            fail("Expected an exception when trying to build a UrlBuilder with invalid input");
        }
    }

    private class UrlBuilder {
        private final String uri;
        private final Map<String, Object> params = new HashMap<>();
        private final Map<String, String> queryParams = new HashMap<>();

        public UrlBuilder(String url) {
            this.uri = url;
            this.params = new HashMap<>();
            this.queryParams = new HashMap<>();
            parseUrl(url);
        }

        private void parseUrl(String url) {
            // Parse URL into components
            String[] parts = uri.split("/");
            if (parts.length > 2 && parts[1].equals("http")) {
                params.clear();
                queryParams.clear();
            } else {
                params.clear();
                queryParams.clear();
            }
        }

        public static class Builder {
            private final String url;

            public Builder fromUri(String url) {
                this.url = url;
                return this;
            }

            public UrlBuilder withParams(Map<String, Object> params) {
                UrlBuilder builder = new UrlBuilder(url);
                builder.params(params);
                return builder;
            }

            public UrlBuilder withQueryParams(Map<String, String> queryParams) {
                UrlBuilder builder = new UrlBuilder(url);
                builder.queryParams(queryParams);
                return builder;
            }
        }

        private Map<String, Object> queryParams() {
            // Build query parameters map
            Map<String, String> queryParamsMap = new HashMap<>();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (!entry.getKey().equals("_")) {
                    queryParamsMap.put(entry.getKey(), entry.getValue());
                }
            }
            return queryParamsMap;
        }

        public String getUri() {
            return uri;
        }

        public Map<String, Object> getParams() {
            return params;
        }

        public Map<String, String> getQueryParams() {
            return queryParams;
        }
    }

}