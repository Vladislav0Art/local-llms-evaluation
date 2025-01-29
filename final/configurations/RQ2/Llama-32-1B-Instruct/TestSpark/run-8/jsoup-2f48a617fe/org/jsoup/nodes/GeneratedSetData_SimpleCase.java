package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

public class GeneratedSetData_SimpleCase {

    @Test
    public void setData_SimpleCase() {
        Comment comment = new Comment("This is a simple comment");
        comment.setData("This is another comment");
        assertEquals("This is a simple comment", comment.getData());
    }

}