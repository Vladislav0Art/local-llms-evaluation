package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test");
        Appendable accum = new StringBuilder();
        comment.outerHtmlHead(accum, 1, new Document.OutputSettings());
        assertEquals("<!-- Test -->", accum.toString());
    }

}