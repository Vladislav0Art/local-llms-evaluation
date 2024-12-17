package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedNodeName {

    @Test
    public void nodeName() {
        Comment comment = new Comment("Example comment");
        assertEquals("Comment", comment.nodeName());
    }

}