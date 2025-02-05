package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.annotation.Nullable;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("test data");
        StringWriter writer = new StringWriter();
        comment.outerHtmlTail(writer, 0, new Document.OutputSettings().prettyPrint(false));
        assertTrue(writer.toString().isEmpty());
    }

}