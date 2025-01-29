package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testBuild() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        String actualUrl = urlBuilder.build();
        URI actualUri = DataUtil.encode(actualUrl);
        assertEquals("https://example.com", actualUri.toString());
    }

    @Test
    public void testAppendKeyVal() {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        Mockito.when(urlBuilder.inputUrl().equals(UTF_8)).thenReturn(new URL("https://example.com"));
    }

    @Test
    public void testBuildWithErrorInputUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        try {
            urlBuilder.build();
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
        }
    }

    public class ConnectionKeyVal {
        private String key;
        private String value;

        public ConnectionKeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ConnectionKeyVal that = (ConnectionKeyVal) o;
            return key.equals(that.key);
        }
    }

    public class URLBuilder {
        public String build() {
            return "https://example.com";
        }

        public void appendKeyVal(Connection.KeyVal kv1) {
            // TODO: implement appendKeyVal
        }

        public void inputUrl(String url) {
            // TODO: implement inputUrl
        }
    }

    @Test
    public void testAppendKeyVal() {
        ConnectionKeyVal kv1 = new Connection.KeyVal("key1", "value1");
        URLBuilder builder = new UrlBuilder();
        builder.appendKeyVal(kv1);
        assertEquals("https://example.com", builder.inputUrl(UTF_8));
    }

    @Test
    public void testBuildWithErrorInputUrl() {
        URLBuilder builder = new UrlBuilder(null);
        try {
            builder.build();
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
        }
    }

}