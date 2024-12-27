package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        StringBuilder out = new StringBuilder();
        Comment comment = new Comment("Test data");
        comment.outerHtmlTail(out, 0, new Document("").outputSettings());
        String expected = ""; // Expected as it is LeafNode, it does not have a tail.
        assertEquals(expected, out.toString());
    }

}