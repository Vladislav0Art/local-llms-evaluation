package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("Test");
        Appendable accum = new StringBuilder();
        comment.outerHtmlTail(accum, 1, new Document.OutputSettings());
        assertEquals("", accum.toString());
    }

}