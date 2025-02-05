package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.StringWriter;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("Some data");
        StringWriter outputWriter = new StringWriter();
        comment.outerHtmlTail(outputWriter, 0, new Document("").outputSettings());
        Assert.assertEquals("", outputWriter.toString());
    }

}