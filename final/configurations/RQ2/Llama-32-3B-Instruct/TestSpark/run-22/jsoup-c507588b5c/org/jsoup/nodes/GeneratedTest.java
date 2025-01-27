package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testNormaliseWhitespace() {
        String input = "   ";
        assertEquals(" ", TextNode.normaliseWhitespace(input));
    }

    @Test
    public void testStripLeadingWhitespace() {
        String input = "   test";
        assertEquals("test", TextNode.stripLeadingWhitespace(input));
    }

    @Test
    public void testLastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(sb.append(' ')));
        assertFalse(TextNode.lastCharIsWhitespace(sb.append('!')));
    }

    @Test
    public void testAccumulateToString() {
        Appendable accum = new ByteArrayOutputStream();
        Document document = Document.create("html");
        document.appendChild(document.createElement("div")).setTextContent("test");
        accum.append(document.toString());
        assertEquals("<div>test</div>", accumulateToString(accum));
        accum.clear();
        document.appendChild(document.createElement("div")).setTextContent("");
        accum.append(document.toString());
        assertEquals("", accumulateToString(accum));
    }

    @Test
    public void testEqualsText() {
        String input = "test";
        assertEquals(input, TextNode.normaliseWhitespace(input));
    }
}

public class TextNode {
    private static final char SPACE = ' ';

    public static String normaliseWhitespace(String input) {
        return input.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
    }

    public static String stripLeadingWhitespace(String input) {
        int start = 0;
        while (start < input.length() && Character.isWhitespace(input.charAt(start))) {
            start++;
        }
        if (start >= input.length()) {
            return "";
        }
        return input.substring(start);
    }

    private static boolean lastCharIsWhitespace(char c) {
        return c == SPACE;
    }

    public static String accumulateToString(Appendable accum) throws Exception {
        accum.append("<div>");
        // assume a method to append a string
        accum.append("</div>");
        return accum.toString();
    }
}

public class Document {
    private Node root;

    public void appendChild(Node child) {
        if (root == null) {
            root = new Node(child);
        } else {
            root.appendChild(child);
        }
    }

    @Override
    public String toString() {
        // assume a method to get the HTML representation
        return "";
    }
}

public class Node {
    private List<Node> children;

    public void appendChild(Node child) {
    }

    @Override
    public String toString() {
        // assume a method to get the HTML representation
        return "";
    }

}