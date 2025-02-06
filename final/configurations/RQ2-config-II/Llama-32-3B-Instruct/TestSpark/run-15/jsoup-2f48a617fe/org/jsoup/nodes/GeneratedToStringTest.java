package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Comment data");
        assertEquals("<!--comment-->", comment.toString());
    }

}