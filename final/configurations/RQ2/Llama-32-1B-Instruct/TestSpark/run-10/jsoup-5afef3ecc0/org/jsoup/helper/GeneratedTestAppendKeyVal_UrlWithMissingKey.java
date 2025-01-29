package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyVal_UrlWithMissingKey {

    public static class URL {
        private String protocol;
        private String host;
        private int port;
        private String path;
        private String query;
        private String fragment;

        public URL(String protocol, String host, int port, String path, String query, String fragment) {
            this.protocol = protocol;
            this.host = host;
            this.port = port;
            this.path = path;
            this.query = query;
            this.fragment = fragment;
        }

        @Override
        public String toString() {
            return "URL{" +
                    "protocol='" + protocol + '\'' +
                    ", host='" + host + '\'' +
                    ", port=" + port +
                    ", path='" + path + '\'' +
                    ", query='" + query + '\'' +
                    ", fragment='" + fragment + '\'' +
                    '}';
        }
    }

    public static class UriBuilder {
        private String base;
        private Map<String, String> params;

        public UriBuilder(String base) {
            this.base = base;
        }

        public UriBuilder withParam(String key, String value) {
            if (params == null || !params.containsKey(key)) {
                throw new RuntimeException("Missing parameter for URIBuilder");
            }
            return addParam(base + "/" + key + "=" + value);
        }

        private UriBuilder addParam(String prefix) {
            String[] parts = base.split("/");
            String path = parts[0];
            if (parts.length > 1) {
                path += "/";
            } else {
                path = "";
            }
            String query = "";
            int fragmentIndex = path.lastIndexOf("#");
            if (fragmentIndex != -1) {
                path = path.substring(0, fragmentIndex);
                query = path + "#" + parts[1];
                path = parts[0] + "/" + parts[1];
            } else {
                query = "";
            }
            return new UriBuilder(prefix, path, "", query, "");
        }

        public UriBuilder toUri() {
            if (params == null) {
                throw new RuntimeException("Missing parameters");
            }
            String url = base;
            for (Map.Entry<String, String> entry : params.entrySet()) {
                url += entry.getKey() + "=" + entry.getValue();
                if (entry.getKey().equals("query") || entry.getKey().equals("fragment")) {
                    url += "#" + entry.getValue();
                } else {
                    url += "/";
                }
            }
            return new Uri(url);
        }

        public static String toString(Object obj) {
            StringBuilder builder = new StringBuilder();
            if (obj instanceof URLBuilder) {
                URLBuilder builderObj = (URLBuilder) obj;
                builder.append(builderObj.base).append(" ");
                if (builderObj.params != null) {
                    for (Map.Entry<String, String> entry : builderObj.params.entrySet()) {
                        builder.append(entry.getKey()).append("=").append(entry.getValue()).append(" ");
                    }
                }
            } else {
                throw new RuntimeException("Unsupported object");
            }
            return builder.toString();
        }

        public static void main(String[] args) {
            URLBuilder builder = new UrlBuilder(new URI("https://example.com"));
            System.out.println(builder.toUri().toString());
            System.out.println(toString(builder.build()));
        }
    }

    @Test
    public void testAppendKeyVal_UrlWithMissingKey() throws UnsupportedEncodingException {
        URL url = new UrlBuilder(new URL("https://example.com", "user", 80, "/", "key=value", "#fragment")).withParam("", value).build();
        assertEquals("https://example.com/user/80/folder/key=value#fragment", url.toString());
    }

}