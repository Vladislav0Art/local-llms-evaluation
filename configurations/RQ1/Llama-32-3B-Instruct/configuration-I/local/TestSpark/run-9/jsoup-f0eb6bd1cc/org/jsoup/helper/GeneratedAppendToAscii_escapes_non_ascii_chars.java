package org.jsoup.helper;

public class GeneratedAppendToAscii_escapes_non_ascii_chars {

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
    public void appendToAscii_escapes_non_ascii_chars() throws URISyntaxException, UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        URLUtils.appendToAscii(sb.append("%C3%A1oth"), false, sb);
        assertEquals("%C3%A0th", sb.toString());
    }

}