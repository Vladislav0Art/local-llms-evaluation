package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Text;

public class GeneratedTestnodeName {

    public static String nodeName(String comment) {
        return comment.nodeName();
    }

    @Test
    public void testnodeName() {
        assertEquals("comment", nodeName("<!-- This is the first part of a comment --><p>This is a sample text.</p>"));
    }

    public static String getData(Node node) {
        if (node instanceof Text) {
            return ((Text) node).getData();
        } else {
            return null;
        }
    }

}