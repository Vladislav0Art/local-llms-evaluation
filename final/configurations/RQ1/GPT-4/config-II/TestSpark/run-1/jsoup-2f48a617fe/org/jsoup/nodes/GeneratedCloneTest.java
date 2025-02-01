package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test comment");
        Comment cloned = comment.clone();
        assertEquals(comment.getData(), cloned.getData());
    }

}