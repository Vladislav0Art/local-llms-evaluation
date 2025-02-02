package org.jsoup.nodes;

public class GeneratedSplitsNodeAtCorrectOffset {

    private String text;
    private String nodeName;

    public Node(String text) {
        this.text = text;
        this.nodeName = "text";
    }

    public void splitText(int offset) {
        // implementation to split the text at the given offset
    }

    public static Node createFromEncoded(String encodedText) {
        // implementation to create a Node from encoded data
        return null;
    }

    public String getText() {
        return this.text;
    }

    public String getnodeName() {
        return this.nodeName;
    }

    public boolean isBlank() {
        // implementation to check if the node is blank
        return false;
    }
}

public class StringUtil {
    public static String normaliseWhitespace(String text) {
        // implementation to normalize whitespace in a string
        return "";
    }
}

public class GeneratedTest {

    @Test
    public void splitsNodeAtCorrectOffset() {
        Node node = new Node("Hello World");
        Object tailNode = node.splitText(6);
        assertNotNull(tailNode);
    }

}