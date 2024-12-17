package org.jsoup.helper;

import org.junit.Test;

import java.net.URL;

public class GeneratedTestBuildWithQueryParams {

    @Test
    public void testBuildWithQueryParams() {
        String url = "https://example.com/path?query=param";
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL urlObject = urlBuilder.build();
        assertEquals(url, urlObject.toString());
    }

    public static class KeyVal {
        private final String key;
        private final String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            KeyVal other = (KeyVal) obj;
            return Objects.equals(key, other.key) && Objects.equals(value, other.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }

    public static String urlToString(StringBuilder sb, String prefix) throws IOException {
        while (sb.length() > 0) {
            if (!Character.isWhitespace(sb.charAt(sb.length() - 1))) {
                sb.append(prefix);
                sb.append(sb.charAt(sb.length() - 1));
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public static String appendKeyVal(KeyVal kv, StringBuilder sb) throws IOException {
        if (kv.key.isEmpty()) {
            return urlToString(sb, "?");
        }
        return urlToString(sb, kv.key + "=" + kv.value);
    }

}