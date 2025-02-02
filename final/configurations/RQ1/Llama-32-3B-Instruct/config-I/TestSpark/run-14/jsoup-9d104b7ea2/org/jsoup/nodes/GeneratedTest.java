package org.jsoup.nodes;

public class GeneratedTest {

    private String text;

    public static TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof TextNode)) return false;
        TextNode other = (TextNode) obj;
        return text.equals(other.text);
    }
}

public class StringUtil {
    public static String normaliseWhitespace(String text) {
        // implement whitespace normalization logic here
        return text.trim();
    }

    public static boolean lastCharIsWhitespace(StringBuilder sb) {
        if (sb.length() == 0) return false;
        char lastChar = sb.charAt(sb.length() - 1);
        return Character.isWhitespace(lastChar);
    }

    public static String stripLeadingWhitespace(String text) {
        int i = 0;
        while (i < text.length() && Character.isWhitespace(text.charAt(i))) i++;
        return text.substring(i);
    }
}

public class GeneratedTest {

    @Test
    public void lastCharIsWhitespace_GivenStringBuilder_ReturnsTrueIfLastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        boolean result = StringUtil.lastCharIsWhitespace(sb);
        assertTrue(result);
    }
}

class TextNode {
    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TextNode other = (TextNode) obj;
        return text.equals(other.text);
    }
}

class StringUtil {
    public static String normaliseWhitespace(String text) {
        // implement whitespace normalization logic here
        return text.trim();
    }

    public static boolean lastCharIsWhitespace(StringBuilder sb) {
        if (sb.length() == 0) return false;
        char lastChar = sb.charAt(sb.length() - 1);
        return Character.isWhitespace(lastChar);
    }

}