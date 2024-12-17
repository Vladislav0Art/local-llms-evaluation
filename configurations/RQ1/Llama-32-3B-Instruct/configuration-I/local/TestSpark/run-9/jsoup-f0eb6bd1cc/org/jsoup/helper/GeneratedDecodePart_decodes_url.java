package org.jsoup.helper;

public class GeneratedDecodePart_decodes_url {

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
    public void decodePart_decodes_url() throws URISyntaxException, UnsupportedEncodingException {
        String encoded = "%C3%A1oth";
        String decoded = URLUtils.decodePart(encoded);
        assertEquals("áoth", decoded);
    }

}