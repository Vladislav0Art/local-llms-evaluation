package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCloneComment {

    @Test
    public void cloneComment() {
        Comment comment = new Comment("Hello World");
        Comment clone = comment.clone();
        assertNotNull(clone);
        assertEquals(5, clone.getData().length());
    }

}