package org.jsoup.helper;

public class GeneratedTestUrlBuilderConstructor {

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