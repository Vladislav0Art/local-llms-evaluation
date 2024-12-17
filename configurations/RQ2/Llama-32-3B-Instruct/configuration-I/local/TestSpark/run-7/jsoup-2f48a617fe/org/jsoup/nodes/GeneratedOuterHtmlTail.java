package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class GeneratedOuterHtmlTail {

    @Test
    public void outerHtmlTail() {
        Element node = new Element();
        Node innerNode = new Node();
        innerNode.appendChild(node);
        node.appendChild(innerNode);
        Appendable appendable = new StringBuilder();
        Comment comment = new Comment();
        comment.setNodeValue("test");
        comment.outerHtmlHead(appendable, 1);
    }

}