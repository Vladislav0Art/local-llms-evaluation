package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertEquals("", accum.toString());
    }

}