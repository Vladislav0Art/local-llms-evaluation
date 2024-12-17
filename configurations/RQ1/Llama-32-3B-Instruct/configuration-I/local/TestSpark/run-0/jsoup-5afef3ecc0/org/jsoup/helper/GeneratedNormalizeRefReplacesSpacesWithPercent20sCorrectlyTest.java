package org.jsoup.helper;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.io.UnsupportedEncodingException;

public class GeneratedNormalizeRefReplacesSpacesWithPercent20sCorrectlyTest {

    @Test
    public void normalizeRefReplacesSpacesWithPercent20sCorrectlyTest() {
        String ref = "# ref with spaces";
        String normalized = UrlBuilder.normalizeRef(ref);
        assertEquals("#%20ref%20with%20spaces", normalized);
    }
}

public class Connection {
    public static class KeyVal implements java.util.Map.Entry<String, String> {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public String setValue(String value) {
            throw new UnsupportedOperationException();
        }
    }

}