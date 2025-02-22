package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Hello World!");
        assertEquals("<!--Hello World!-->", comment.toString());
    }

}