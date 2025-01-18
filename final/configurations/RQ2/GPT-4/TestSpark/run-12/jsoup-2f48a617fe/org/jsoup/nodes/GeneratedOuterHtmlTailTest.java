package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Parser;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws Exception {
        String outerHtmlTail = "";
        Comment comment = new Comment("test comment");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings settings = new Document("").outputSettings();
        comment.outerHtmlTail(sb, 0, settings);
        Assert.assertEquals(outerHtmlTail, sb.toString());
    }

}