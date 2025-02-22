package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Hello World!");
        assertEquals("#comment", comment.nodeName());
    }

}