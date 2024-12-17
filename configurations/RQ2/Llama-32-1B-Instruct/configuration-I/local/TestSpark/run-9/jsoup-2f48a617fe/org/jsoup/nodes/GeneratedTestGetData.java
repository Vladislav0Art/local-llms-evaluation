package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestGetData {

    @Test
    public void testGetData() {
        Comment comment = new Comment("This is a sample comment");
        assertEquals("This is a sample comment", comment.getData());
    }

}