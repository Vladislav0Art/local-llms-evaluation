package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

public class GeneratedTestsetData {

    @Test
    public void testsetData() {
        Comment comment = new Comment("This is a comment");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

}