package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

import static org.junit.Assert.assertEquals;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("data");
        assertEquals("#comment", comment.nodeName());
    }

}