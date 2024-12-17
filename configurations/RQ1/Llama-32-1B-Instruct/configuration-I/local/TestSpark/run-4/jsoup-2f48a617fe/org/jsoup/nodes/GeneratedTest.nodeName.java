package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Text;

public class GeneratedTest.

nodeName {

    @Test
    public void test.nodeName() {
        String comment = "<!-- This is the first part of a comment --><p>This is a sample text.</p>";
        Node node = new Text(comment);
        Node parent = node.parent();
        Node child = node.next().first();

        assertEquals("comment", child.nodeName());
    }

}