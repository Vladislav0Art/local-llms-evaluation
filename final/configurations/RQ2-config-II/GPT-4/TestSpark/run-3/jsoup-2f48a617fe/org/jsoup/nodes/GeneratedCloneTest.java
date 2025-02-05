package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test data");
        Comment clone = comment.clone();
        assertEquals(comment.getData(), clone.getData());
        assertEquals(comment.nodeName(), clone.nodeName());
    }

}