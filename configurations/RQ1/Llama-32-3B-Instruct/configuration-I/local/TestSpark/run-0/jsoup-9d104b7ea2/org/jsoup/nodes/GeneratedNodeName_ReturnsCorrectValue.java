package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsCorrectValue {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public static TextNode createFromEncoded(String encodedText) throws IOException {
        // implementation to decode and return a new TextNode
        return new TextNode(encodedText);
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

    public String splitText(int offset) {
        if (offset >= 0 && offset <= text.length()) {
            return text.substring(offset);
        }
        throw new IndexOutOfBoundsException("Offset out of range");
    }

    @Override
    public String toString() throws IOException {
        // implementation to generate the outer HTML
        return "text=" + text;
    }

    public static class NodeInfo {
        private int offset;

        public NodeInfo(int offset) {
            this.offset = offset;
        }

        public boolean isBlank() {
            return offset >= 0 && offset <= text.length();
        }
    }

    public NodeInfo getNodeInfo() {
        return new NodeInfo(offset);
    }

    public static class Offset {
        private int value;

        public Offset(int value) {
            this.value = value;
        }

        public boolean equals(TextNode node, int offset) {
            return value == node.getNodeInfo().offset;
        }
    }
}

public class GeneratedTest {

    @Test
    public void nodeName_ReturnsCorrectValue() {
        TextNode node = new TextNode("");
        assertEquals("#text", node.nodeName());
    }

}