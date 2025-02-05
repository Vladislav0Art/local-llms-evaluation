package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Document;

import java.io.StringWriter;
import java.io.IOException;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test Comment");
        assertTrue(comment.toString().startsWith("<!--"));
        assertTrue(comment.toString().endsWith("-->"));
        assertTrue(comment.toString().contains("Test Comment"));
    }

}