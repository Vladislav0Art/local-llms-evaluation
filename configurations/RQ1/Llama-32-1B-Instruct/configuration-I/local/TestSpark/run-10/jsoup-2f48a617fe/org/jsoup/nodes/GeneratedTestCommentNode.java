package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestCommentNode {

    @Test
    public void testCommentNode() {
        String data = "# This is a comment";
        Element comment = new Document().nodeByValue(data);
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
    }

}