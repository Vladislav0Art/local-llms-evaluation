package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedNodeNameCommentNotNull {

    @Test
    public void nodeNameCommentNotNull() {
        Comment comment = new Comment("data");
        assertNotNull(comment.nodeName());
    }

}