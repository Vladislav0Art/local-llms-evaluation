package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class GeneratedSetNodeIdSetData {

    @Test
    public void setNodeIdSetData() {
        Comment comment = new Comment();
        comment.setNodeValue("test");
        assertEquals("test", comment.getData());
    }

}