package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenLeafNode_ReturnsTextNode {

    private String text;

    public static TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
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
    public void createTextNode_GivenLeafNode_ReturnsTextNode() throws IOException {
        String text = "Hello World";
        TextNode node = StringUtil.createTextNode(text);
        TextNode expected = new TextNode("Hello World");
        assertEquals(expected, node);
    }

}