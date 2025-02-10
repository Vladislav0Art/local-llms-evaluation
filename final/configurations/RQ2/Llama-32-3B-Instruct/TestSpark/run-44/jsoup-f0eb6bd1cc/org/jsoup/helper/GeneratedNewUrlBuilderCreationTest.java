package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedNewUrlBuilderCreationTest {

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

    @Test
    public void newUrlBuilderCreationTest() {
        UrlBuilder builder = new UrlBuilder(null);
        assertNotNull(builder);
    }

}