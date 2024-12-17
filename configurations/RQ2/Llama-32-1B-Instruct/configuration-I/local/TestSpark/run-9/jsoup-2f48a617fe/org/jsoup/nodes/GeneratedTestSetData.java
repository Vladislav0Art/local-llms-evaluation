package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Comment comment = new Comment("This is a sample comment");
        comment.setData("New content");
        assertEquals("New content", comment.getData());
    }

}