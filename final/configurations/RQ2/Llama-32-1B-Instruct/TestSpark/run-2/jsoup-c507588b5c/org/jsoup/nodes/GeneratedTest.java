package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testnodeName() {
        TextNode node = new TextNode("Hello");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void testText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

    @Test
    public void testTextFromEncoded() {
        String encodedText = "Hello, World!";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello, World!", node.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("Hello\nWorld");
        assertEquals("Hello\nWorld", node.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("");
        assertEquals(true, node.isBlank());
    }

    @Test
    public void testSplitTextOffset() {
        TextNode node = new TextNode("Hello World");
        assertEquals(Arrays.asList("Hello", "World"), node.splitText(0));
        assertEquals(Arrays.asList("Hello", "World"), node.splitText(2));
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document document = new Document();
        Appendable result = document.outerHtmlHead(new java.util.ArrayList<>() {{
            add(document.outerHtml);
        }}, 0, null);
        assertEquals("<p>Hello World</p>", result.toString());
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        Document document = new Document();
        Appendable result = document.outerHtmlTail(new java.util.ArrayList<>() {{
            add(document.outerHtml);
        }}, 0, null);
        assertEquals("Hello", result.toString().trim());
    }

    public static class TextNode implements Comparable<TextNode> {

        private String content;

        public TextNode(String content) {
            this.content = content;
        }

        @Override
        public int compareTo(TextNode other) {
            return Integer.compare(other.content.length(), content.length());
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            TextNode textNode = (TextNode) obj;
            return content.equals(textNode.content);
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(content);
        }

        public String getContent() {
            return content;
        }
    }

    public static class Document implements Comparable<Document> {

        private Appendable outerHtml;

        public Document() {
        }

        public void add(Appendable appendable) {
            outerHtml = appendable;
        }

        @Override
        public int compareTo(Document other) {
            return Integer.compare(this.outerHtml.length(), other.outerHtml.length());
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Document document = (Document) obj;
            return outerHtml.equals(document.outerHtml);
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(outerHtml.toString());
        }
    }

}