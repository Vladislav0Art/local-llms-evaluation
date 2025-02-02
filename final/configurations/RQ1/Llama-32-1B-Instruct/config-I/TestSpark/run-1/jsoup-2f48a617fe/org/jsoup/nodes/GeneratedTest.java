package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    @Test
    public void testCommentNode() {
        Comment comment = new Comment("#This is a comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        Comment comment = new Comment("This is a comment with some content");
        assertEquals("This is a comment with some content", comment.getData());
    }

}