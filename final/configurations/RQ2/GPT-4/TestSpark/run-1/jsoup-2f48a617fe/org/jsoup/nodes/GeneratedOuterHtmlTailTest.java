package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("test");
        StringBuilder stringBuilder = new StringBuilder();
        comment.outerHtmlTail(stringBuilder, 0, new Document.OutputSettings());
        Assert.assertEquals("", stringBuilder.toString());
    }

}