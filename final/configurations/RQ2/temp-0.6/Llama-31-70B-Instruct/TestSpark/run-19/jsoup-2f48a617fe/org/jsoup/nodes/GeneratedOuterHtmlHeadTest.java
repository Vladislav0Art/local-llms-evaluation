package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Data");
        String expectedHtml = "<!--Data-->";
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, new Document.OutputSettings());
        String actualHtml = accum.toString();
        assertEquals(expectedHtml, actualHtml);
    }

}