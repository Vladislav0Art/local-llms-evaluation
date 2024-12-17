package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class GeneratedGetDataCommentDataTest {

    @Test
    public void getDataCommentDataTest() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

}