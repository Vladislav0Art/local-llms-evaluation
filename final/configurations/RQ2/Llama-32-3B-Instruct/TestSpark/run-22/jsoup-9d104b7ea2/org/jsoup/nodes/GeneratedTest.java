package org.jsoup.nodes;

public class GeneratedTest {

    private String value;

    public static String createFromEncoded(String encodedValue) {
        return encodedValue;
    }

    public static boolean lastCharIsWhitespace(StringBuilder sb) {
        if (sb.length() == 0) {
            return false;
        }
        char c = sb.charAt(sb.length() - 1);
        switch (c) {
            case '\n':
            case '\r':
                return true;
            default:
                return false;
        }
    }

    public static String stripLeadingWhitespace(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
            }
        }
        return sb.toString();
    }

    public static String normaliseWhitespace(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
            }
        }
        return sb.toString();
    }

    public String getValue() {
        return value;
    }
}

public class GeneratedTest {

}