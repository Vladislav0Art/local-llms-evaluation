package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedClone ReturnsSameComment {

    @Test
    public void clone

    ReturnsSameComment() {
        Comment comment = new Comment("Some data");
        Comment cloned = comment.clone();
        assertSame(comment, cloned);
    }

}