package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

public class GeneratedSetDataSetsCorrectAttribute {

    @Test
    public void setDataSetsCorrectAttribute() {
        String data = "This is a test comment.";
        Comment comment = new Comment(data);
        comment.setData("expected attribute value");
        assertEquals("expected attribute value", comment.getData());
    }

}