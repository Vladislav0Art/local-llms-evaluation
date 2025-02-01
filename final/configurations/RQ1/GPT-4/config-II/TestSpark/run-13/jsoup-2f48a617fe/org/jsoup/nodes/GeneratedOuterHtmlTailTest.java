package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedOuterHtmlTailTest {

    // Testing constructor and constructors related methods

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("test comment");
        StringBuilder stringBuilder = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        comment.outerHtmlTail(stringBuilder, 0, outputSettings);
        assertEquals("", stringBuilder.toString());  // Expected nothing to be appended
    }

}