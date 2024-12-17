package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedIsParamAddedFailed_ReturnsFalseWhenParamWasAdded {

    @Mock
    private Connection connection;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isParamAddedFailed_ReturnsFalseWhenParamWasAdded() {
        boolean expected = false;
        when(connection.isParamAdded()).thenReturn(true);
        assertFalse(urlBuilder.isParamAddedFailed());
    }
}

public class UrlBuilder {

    private Connection connection;

    private URL inputUrl;

    public UrlBuilder(Connection connection) {
        this.connection = connection;
    }

    public void inputUrl(URL inputUrl) {
        this.inputUrl = inputUrl;
    }

    public URL build() {
        return connection.getUrl();
    }

    public Map<String, String> getParams() {
        Map<String, String> params = new HashMap<>();
        // implementation
        return params;
    }

    public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
        // implementation
    }

    public boolean isParamAddedFailed() {
        // implementation
        return false;
    }
}

public class Connection {

    private URL url;

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public boolean isParamAdded() {
        // implementation
        return true;
    }

    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

}