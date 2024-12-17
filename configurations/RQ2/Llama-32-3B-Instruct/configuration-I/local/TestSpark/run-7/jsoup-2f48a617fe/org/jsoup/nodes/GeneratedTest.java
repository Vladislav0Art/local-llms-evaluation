package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class GeneratedTest {

    @Test
    public void newNode() {
        Comment comment = new Comment("test");
        assertNotNull(comment);
    }

    @Test
    public void getNodeId() {
        Comment comment = new Comment("test");
        assertEquals("", comment.nodeName());
    }

    @Test
    public void getDataCommentDataTest() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void setNodeIdSetData() {
        Comment comment = new Comment();
        comment.setNodeValue("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void outerHtmlHead() {
        Element node = new Element();
        Node innerNode = new Node();
        innerNode.appendChild(node);
        node.appendChild(innerNode);
        Appendable appendable = new StringBuilder();
        Comment comment = new Comment();
        comment.setNodeValue("test");
        comment.outerHtmlHead(appendable, 1);
    }

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

    @Test
    public void clone() {
        Element node = new Element();
        Node innerNode = new Node();
        innerNode.appendChild(node);
        node.appendChild(innerNode);
        Appendable appendable = new StringBuilder();
        Comment comment = new Comment();
        comment.setNodeValue("test");
        Comment clonedComment = comment.clone(appendable, 1);
    }

}