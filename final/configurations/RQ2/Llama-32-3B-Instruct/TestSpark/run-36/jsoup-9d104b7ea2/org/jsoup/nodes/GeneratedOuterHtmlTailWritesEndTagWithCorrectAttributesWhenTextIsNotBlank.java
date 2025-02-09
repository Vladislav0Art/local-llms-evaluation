package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Text;
import org.junit.Test;

public class GeneratedOuterHtmlTailWritesEndTagWithCorrectAttributesWhenTextIsNotBlank {

    @Test
    public void outerHtmlTailWritesEndTagWithCorrectAttributesWhenTextIsNotBlank() throws IOException {
        Document document = Jsoup.parse("<head></head>");
        Node node = new LeafNode(document.body(0), null, null);
        when(node.text()).thenReturn("encoded text");
        String result = textNode.splitText(offset);
        assertEquals("", result);
    }
}

public class LeafNode extends Node {
    private TextNode text;

    public LeafNode(TextNode text) {
        this.text = text;
    }

    @Override
    public void outerHtmlHead() throws IOException {
        System.out.println("<head>");
    }

    @Override
    public String outerHtmlHead(String offset) {
        return "<head>";
    }

    @Override
    public TextNode text(Node node, int offset) {
        return text;
    }
}

public class Node extends LeafNode {
    public Node(TextNode text, Node parent, int offset) {
        super(text);
    }

}