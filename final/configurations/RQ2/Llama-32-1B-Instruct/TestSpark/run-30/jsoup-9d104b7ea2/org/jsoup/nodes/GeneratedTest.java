package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    private String text;
    private int offset;

    public Node(String text) {
        this.text = text;
        this.offset = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return offset - node.offset + text.equals(node.text);
    }

    @Override
    public int hashCode() {
        return 31 * offset + text.hashCode();
    }
}

public class TestSparkRunner {

    @Test
    public void nodeName_MatchTextNodeName() {
        Node node = new Node("Hello, World!");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void text_MatchTextNodesText() {
        Node node = new Node("Hello, World!");
        assertEquals("Hello, World!", node.text("Hello, World!"));
    }

    @Test
    public void text_MatchTextNodesBlankText() {
        String text = "";
        Node node = new Node(text);
        assertTrue(node.isBlank());
    }

    @Test
    public void splitText_MatchTextNodesSplit() {
        Document document = new Document();
        Element element = document.createElement("p");
        element.text = "Hello, World!";
        document.appendChild(element);
        OffsetNode offsetNode = (OffsetNode) document.evaluate("text(), 0").next();
        assertEquals(new String[]{"<p>}", offsetNode.outerHtml());
	}

        @Test
        public void outerHtml_MatchTest () {
            Node node = new Node("<p>Hello, World!</p>");
            assertEquals("<p>Hello, World!</p>", node.outerHtml());
        }

        @Test
        public void outerHtml_MatchNoMatch () {
            String text = "";
            Node node = (Node) document.evaluate("Hello, World!", offset);
            assertEquals("", node.outerHtml());
        }

        @Test
        public void outerHtml_MatchEmptyText () {
            Node node = new Node("");
            assertEquals("", node.outerHtml());
        }

        @Test
        public void innerHtml_MatchTest () {
            String text = "<p>Hello, World!</p>";
            Node node = new Node(text);
            assertEquals("<p>Hello, World!</p>", node.innerHtml());
        }

        @Test
        public void innerHtml_MatchNoMatch () {
            String text = "";
            Node node = (Node) document.evaluate("Hello, World!", offset);
            assertEquals("<p>Hello, World!</p>", node.innerHtml());
        }

        @Test
        public void innerHtml_MatchEmptyText () {
            String text = "";
            Node node = new Node(text);
            assertEquals("", node.innerHtml());
        }

        @Test
        public void outerHtmlWithNewLine_MatchTest () {
            String text = "Hello, World!\n";
            Node node = new Node(text);
            assertEquals("<p>Hello, World!</p>\n", node.outerHtml());
        }

        @Test
        public void outerHtmlWithNewLine_MatchNoMatch () {
            String text = "Hello, World!";
            Node node = (Node) document.evaluate("Hello, World!", offset);
            assertEquals("<p>Hello, World!</p>", node.outerHtml());
        }

        @Test
        public void outerHtmlWithNonExistingCharacter_MatchTest () {
            String text = "<Hello, World!>";
            Node node = new Node(text);
            assertEquals("", node.outerHtml());
        }

        @Test
        public void innerHtmlWithNewLine_MatchTest () {
            String text = "<p>Hello, World!</p>\n";
            Node node = new Node(text);
            assertEquals("<p>Hello, World!\n</p>", node.innerHtml());
        }

        @Test
        public void innerHtmlWithNonExistingCharacter_MatchTest () {
            String text = "<Hello, World!>";
            Node node = (Node) document.evaluate("Hello, World!", offset);
            assertEquals("", node.innerHtml());
        }

        @Test
        public void innerHtmlWithNonExistingCharacter_MatchNone () {
            String text = "";
            Node node = new Node(text);
            assertEquals("", node.innerHtml());
        }

    }