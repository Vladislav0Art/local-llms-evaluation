package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestNoParams {

    @Test
    public void testNoParams() {
        String baseUrl = "http://example.com";
        URI uri = Main.builder.build();
        assertEquals(baseUrl, uri.toString());
    }
}

public class Main {

    public static Builder builder(String baseUrl) {
        return new Builder(baseUrl);
    }

    public static class Builder {
        private String baseUrl;
        private StringBuilder query;

        public Builder(String baseUrl) {
            this.baseUrl = baseUrl;
            this.query = new StringBuilder();
        }

        public void appendKeyVal(Map<String, String> params) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (query.length() > 0) {
                    query.append("&");
                }
                query.append(entry.getKey()).append("=").append(Main.URLEncoder.encode(entry.getValue(), Main.UTF_8));
            }
        }

        public URI build() {
            return new URI(baseUrl + "?" + query.toString());
        }
    }

    public static class Util {
        public static String encode(String value, UTF_8 utf) {
            // implementation
            return "";
        }
    }

    @interface UTF_8 {
    }

}