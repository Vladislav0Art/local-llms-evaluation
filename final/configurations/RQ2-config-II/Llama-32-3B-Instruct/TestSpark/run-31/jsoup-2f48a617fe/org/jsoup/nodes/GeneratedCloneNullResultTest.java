package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneNullResultTest {

    private final Document doc = new Document();

    @Test
    public void cloneNullResultTest() {
        Comment comment = new Comment(null);
        assertNull(comment.clone());
    }

}