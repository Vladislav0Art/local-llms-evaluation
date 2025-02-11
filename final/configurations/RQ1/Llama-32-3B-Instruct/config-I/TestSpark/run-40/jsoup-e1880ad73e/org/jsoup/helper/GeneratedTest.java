package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testNewUrlBuilderWithValidUrl_BUILDSURL() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?query#anchor";
        String protocol = "";
        String host = "example.com";
        String path = "/path";
        String query = "key=value&another+key=anothervalu";

        URL parsedUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(parsedUrl);

        assertEquals(protocol, builder.u.getProtocol());
        assertEquals(host, builder.u.getHost());
        assertEquals(path, builder.u.getPath());

        assertEquals(query, builder.u.getQuery());
    }

    @Test
    public void testNewUrlBuilderWithInvalidProtocol_BUILDSURL() throws MalformedURLException, URISyntaxException {
        String url = "http+/example.com/path";
        String protocol = "";
        String host = "example.com";
        String path = "/path";
        String query = "";

        URL parsedUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(parsedUrl);

        assertEquals(protocol, builder.u.getProtocol());
        assertEquals(host, builder.u.getHost());
        assertEquals(path, builder.u.getPath());

        assertEquals(query, builder.u.getQuery());
    }

    @Test
    public void testAppendKeyVal_BUILDSURL() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path";
        String protocol = "";
        String host = "example.com";
        String path = "/path";
        String query = "";

        URL parsedUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(parsedUrl);

        assertEquals(protocol, builder.u.getProtocol());
        assertEquals(host, builder.u.getHost());
        assertEquals(path, builder.u.getPath());

        assertEquals(query, builder.u.getQuery());

        String newQuery = "key=value&another+key=anothervalu";
        builder.appendQuery(newQuery);
        assertEquals(newQuery, builder.u.getQuery());
    }

    @Test
    public void testUrlBuilderConstructor() {
        String url = "http://example.com/path?query#anchor";

        UrlBuilder builder = new UrlBuilder(url);

        assertEquals("http", builder.u.getProtocol());
        assertEquals("example.com", builder.u.getHost());
        assertEquals("/path", builder.u.getPath());

        assertEquals("key=value&another+key=anothervalu", builder.u.getQuery());
    }

    public static class UrlBuilder {
        private String protocol;
        private String host;
        private String path;
        private String query;

        public UrlBuilder(String url) throws MalformedURLException, URISyntaxException {
            URL parsedUrl = new URL(url);
            this.protocol = parsedUrl.getProtocol();
            this.host = parsedUrl.getHost();
            this.path = parsedUrl.getPath();

            if (parsedUrl.getQuery() != null) {
                this.query = parsedUrl.getQuery();
            } else {
                this.query = "";
            }
        }

        public void appendQuery(String query) {
            this.query += "&" + query;
        }

        public String getProtocol() {
            return protocol;
        }

        public String getHost() {
            return host;
        }

        public String getPath() {
            return path;
        }

        public String getQuery() {
            return query;
        }
    }

}