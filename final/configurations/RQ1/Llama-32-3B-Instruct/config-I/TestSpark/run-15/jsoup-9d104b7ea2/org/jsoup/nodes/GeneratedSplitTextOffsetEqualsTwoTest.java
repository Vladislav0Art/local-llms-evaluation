package org.jsoup.nodes;

public class GeneratedSplitTextOffsetEqualsTwoTest {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public static TextNodecreateFromEncoded(String encodedText) {
        // implementation to create TextNode from encoded string
        return new TextNode(encodedText);
    }

    public String getWholeText() {
        return text;
    }

    public int splitText(int offset) {
        return offset;
    }

    public void outerHtmlHead(StringBuilder builder, int offset, Document.OutputSettings out) {
        // implementation to set HTML head
    }

    public void outerHtmlTail(StringBuilder builder, int offset, Document.OutputSettings out) {
        // implementation to set HTML tail
    }

    public String toString() {
        return "<p>" + text + "</p>";
    }

    public TextNode clone() {
        return new TextNode(text);
    }
}

public class GeneratedTest {

    @Test
    public void splitTextOffsetEqualsTwoTest() {
        String text = "ab c";
        TextNode node = new TextNode(text);
        int offset = node.splitText(2);
        assertEquals("", node.getWholeText().substring(offset, node.getWholeText().length()));
    }
}

public class Document {
    public static class OutputSettings {
        // implementation to set output settings
    }

}