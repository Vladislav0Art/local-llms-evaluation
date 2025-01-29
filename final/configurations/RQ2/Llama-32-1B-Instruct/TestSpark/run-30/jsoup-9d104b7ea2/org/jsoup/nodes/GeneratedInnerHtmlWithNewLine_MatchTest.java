package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedInnerHtmlWithNewLine_MatchTest {

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
    public void innerHtmlWithNewLine_MatchTest() {
        String text = "<p>Hello, World!</p>\n";
        Node node = new Node(text);
        assertEquals("<p>Hello, World!\n</p>", node.innerHtml());
    }

}