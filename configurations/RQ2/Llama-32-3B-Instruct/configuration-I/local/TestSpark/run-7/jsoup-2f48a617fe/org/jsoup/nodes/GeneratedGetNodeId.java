package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class GeneratedGetNodeId {

    @Test
    public void getNodeId() {
        Comment comment = new Comment("test");
        assertEquals("", comment.nodeName());
    }

}