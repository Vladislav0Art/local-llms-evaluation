package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("hello");
        assertEquals("<!---->", comment.toString());
    }

}