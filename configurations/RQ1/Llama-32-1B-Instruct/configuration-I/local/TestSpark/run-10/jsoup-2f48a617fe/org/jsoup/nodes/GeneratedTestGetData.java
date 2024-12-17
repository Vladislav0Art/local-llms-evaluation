package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestGetData {

    @Test
    public void testGetData() {
        String data = "# This is a comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}