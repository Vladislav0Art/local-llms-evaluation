package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Hello World!").clone();
        assertEquals("Hello World!", comment.getData());
    }

}