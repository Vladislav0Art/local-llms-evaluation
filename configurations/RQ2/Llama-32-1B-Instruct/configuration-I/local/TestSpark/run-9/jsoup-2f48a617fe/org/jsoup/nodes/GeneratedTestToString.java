package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        Comment comment = new Comment("This is a sample comment");
        String expected = "comment";
        assertEquals(expected, comment.toString());
    }

}