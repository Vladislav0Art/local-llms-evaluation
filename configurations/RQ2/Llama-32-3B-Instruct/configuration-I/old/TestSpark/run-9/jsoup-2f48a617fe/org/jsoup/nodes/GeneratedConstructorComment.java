package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedConstructorComment {

    @Test
    public void constructorComment() {
        Comment comment = new Comment("Hello World");
        assertNotNull(comment);
        assertEquals(1, comment.getNodeName().length());
        assertEquals(5, comment.getData().length());
    }

}