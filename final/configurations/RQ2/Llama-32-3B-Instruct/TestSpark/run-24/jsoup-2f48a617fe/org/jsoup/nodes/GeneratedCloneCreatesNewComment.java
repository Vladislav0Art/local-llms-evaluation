package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedCloneCreatesNewComment {

    @Test
    public void cloneCreatesNewComment() {
        Comment original = new Comment("data");
        Comment clone = original.clone();
        assertNotNull(clone);
        assertEquals(original.getData(), clone.getData());
    }

}