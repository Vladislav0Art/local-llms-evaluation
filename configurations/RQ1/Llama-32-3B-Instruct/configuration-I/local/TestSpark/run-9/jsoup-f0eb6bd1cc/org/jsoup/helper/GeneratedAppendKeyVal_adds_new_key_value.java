package org.jsoup.helper;

public class GeneratedAppendKeyVal_adds_new_key_value {

    public static String encodePart(String part) throws URISyntaxException {
        // implementation
    }

    public static String decodePart(String encoded) throws URISyntaxException, UnsupportedEncodingException {
        return new String(encoded.getBytes(), "ISO-8859-1");
    }

    public static StringBuilder appendToAscii(String input, boolean escapeSpace, StringBuilder sb) {
        if (escapeSpace && !input.equals("áóth ")) {
            sb.append("%C3%A0%60");
        } else {
            sb.append(input);
        }
        return sb;
    }
}

public class Connection {
    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("%s=%s", key, value);
        }
    }
}

public class GeneratedTest {

    @Test
    public void appendKeyVal_adds_new_key_value() throws URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://example.com/path");
        StringBuilder sb = new StringBuilder(inputUrl.getQuery());
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        URLUtils.appendToAscii(sb.append("=").append(kv.key).append("=").append(kv.value), true, sb);
        assertEquals("?key=value", sb.toString());
    }

}