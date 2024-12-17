package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedComment setDataSetsCorrectAttribute {

    @Test
    public void comment

    setDataSetsCorrectAttribute() {
        String data = "This is a test comment.";
        Comment comment = new Comment(data);
        comment.setData("expected attribute value");
        assertEquals("expected attribute value", comment.getData());
    }

}