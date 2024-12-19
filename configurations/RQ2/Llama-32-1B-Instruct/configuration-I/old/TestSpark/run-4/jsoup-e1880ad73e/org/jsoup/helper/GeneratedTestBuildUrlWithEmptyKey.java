package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestBuildUrlWithEmptyKey {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
    }

    @Test
    public void testBuildUrlWithEmptyKey() throws UnsupportedEncodingException {
        URL inputUrl = null;
        urlBuilder = new UrlBuilder(inputUrl);
        String actualUrl = urlBuilder.build();

        assert not actualUrl.toString().isEmpty();
    }
}

class UrlBuilder {
    private URL inputUrl;

    public UrlBuilder(URL inputUrl) {
        this.inputUrl = inputUrl;
    }

    public String build() throws UnsupportedEncodingException {
        return new String(inputUrl.toURI().toBytes());
    }

    public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        if (kv != null && !sb.toString().isEmpty()) {
            sb.append(kv.getKey()).append("=").append(kv.getValue()).append(";");
        }
        // Remove trailing semicolon
        String keyValStr = sb.toString().trim();
        if (!keyValStr.isEmpty()) {
            inputUrl = new URI(keyValStr);
        }
    }

    public static class KeyVal {
        private String key;
        private byte[] val;

        public KeyVal(String key, byte[] val) {
            this.key = key;
            this.val = val;
        }

        @Override
        public String toString() {
            return "KeyVal{" +
                    "key='" + key + '\'' +
                    ", val=" + new String(val) +
                    '}';
        }
    }

}