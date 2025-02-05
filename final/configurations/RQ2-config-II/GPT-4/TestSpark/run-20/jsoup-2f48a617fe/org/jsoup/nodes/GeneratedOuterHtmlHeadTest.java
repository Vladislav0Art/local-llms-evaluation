package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.annotation.Nullable;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws Exception {
        StringWriter writer = new StringWriter();
        Comment comment = new Comment("test data");
        comment.outerHtmlHead(writer, 0, Parser.unescapeEntities("<!---->", false));
        assertTrue(writer.toString().length() > 0);
    }

}