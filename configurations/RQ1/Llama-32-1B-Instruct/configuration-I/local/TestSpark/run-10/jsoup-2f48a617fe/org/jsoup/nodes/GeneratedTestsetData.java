package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestsetData {

    @Test
    public void testsetData() {
        String data = "# This is a comment";
        Comment comment = new Comment(data);
        comment.setData("New value");
        assertNotNull(comment);
        assertEquals(data, comment.getData());
    }

}