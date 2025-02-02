package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetDataOnComment {

    @Test
    public void setDataOnComment() {
        Comment comment = new Comment("<!-- This is a comment -->");
        try {
            comment.setData("New comment content");
            assertEquals(comment.getData(), "New comment content");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}