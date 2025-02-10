package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    public class Connection {
        public interface KeyVal {
            public Builder builder();
        }

        public static class Builder {
            private String value;

            public Builder key(String key) {
                return this;
            }

            public Builder value(String value) throws UnsupportedEncodingException {
                this.value = URLEncoder.encode(value, "UTF-8");
                return this;
            }

            public UrlBuilder build() {
                return new UrlBuilder(new URI("http://localhost"));
            }
        }
    }

    public class UrlBuilder {

        private String uri;
        private StringBuilder query;

        public UrlBuilder(URI uri) {
            this.uri = uri;
            this.query = new StringBuilder();
        }

        public void appendKeyVal(Connection.KeyVal kv) {
            if (kv instanceof Connection.Builder) {
                Connection.Builder builder = (Connection.Builder) kv;
                query.append("a=").append(builder.value).append("&");
            } else {
                query.append(kv.value()).append("&");
            }
        }

        public String build() {
            return uri.toString() + "?" + query.substring(0, query.length() - 1);
        }
    }

    @Test
    public void newUrlBuilderCreationTest() {
        UrlBuilder builder = new UrlBuilder(null);
        assertNotNull(builder);
    }

}