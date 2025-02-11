package org.jsoup.helper;

public class GeneratedTestDecodePartWithSpace {

    @Test
    public void testDecodePartWithSpace() {
        UrlBuilder builder = new UrlBuilder();
        builder.decode("a%20b");
        assertEquals("ab", builder.result);
    }
}

public class UrlBuilder {

    private StringBuilder q;

    public UrlBuilder() {
        this.q = new StringBuilder();
    }

    public void append(String key, String val) {
        if (q.length() > 0) {
            q.append("&");
        }
        q.append(key).append("=").append(val);
    }

    public void appendWithSpace(String key, String val) {
        if (q.length() > 0) {
            q.append("+");
        }
        q.append(key).append("=").append(val);
    }

    public void decode(String str) {
        result = unquote(str);
    }

    private String unquote(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '%') {
                int codePoint = Integer.parseInt(s.substring(i + 1, i + 3), 16);
                sb.append((char) codePoint);
                i += 2;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private String result;

    public String toString() {
        return q.toString();
    }

}