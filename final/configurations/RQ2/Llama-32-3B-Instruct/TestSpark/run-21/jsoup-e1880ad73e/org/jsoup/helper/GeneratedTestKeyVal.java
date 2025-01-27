package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

import org.mockito.Mockito;

public class GeneratedTestKeyVal {

    @Test
    public void testKeyVal() {
        KeyVal kv = new Connection.KeyVal("key", "value");
        Mockito.when(kv.getKey()).thenReturn("key");
        Mockito.when(kv.getValue()).thenReturn("value");
        String result = builder.appendKeyVal(kv).toString();
        // add assertions here if needed
    }
}

public class UrlBuilder {
    public String buildUrl() throws URISyntaxException {
        return "";
    }

    public UrlBuilder appendKeyVal(KeyVal kv) {
        return this;
    }
}

public class Connection {
    private String scheme;

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
}

public class KeyVal {
    private String key;
    private String value;

    public KeyVal(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setValue(String value) {
        this.value = value;
    }

}