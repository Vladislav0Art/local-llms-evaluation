package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class GeneratedAppendKeyValToUrlReturnsCorrectString {

    public void setUp() {
        // No setup needed
    }

    @Test
    public void appendKeyValToUrlReturnsCorrectString() throws Exception {
        String inputUrl = "http://example.com";
        UrlBuilder builder = new UrlBuilder();
        Connection.KeyVal keyVal = new Connection.KeyVal("key1", "value1");
        assertEquals("http://example.com?key1=value1", builder.appendKeyVal(inputUrl, keyVal).toString());
    }

}

class UrlBuilder {
    private String inputUrl;

    public UrlBuilder(String inputUrl) {
        this.inputUrl = inputUrl;
    }

    public UrlBuilder appendKeyVal(String url, Connection.KeyVal keyVal) {
        return new UrlBuilder(url + "?key=" + keyVal.getKey() + "=" + keyVal.getValue());
    }

    public String build() throws Exception {
        // Implementation of the build method
        return "http://example.com";
    }
}

class Connection {
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