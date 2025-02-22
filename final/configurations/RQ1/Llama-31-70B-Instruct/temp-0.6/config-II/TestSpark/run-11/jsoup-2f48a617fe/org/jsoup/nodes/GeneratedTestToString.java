package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        Comment comment = new Comment("Some text");
        String actual = comment.toString();
        assertEquals("<!--Some text-->", actual);
    }

}