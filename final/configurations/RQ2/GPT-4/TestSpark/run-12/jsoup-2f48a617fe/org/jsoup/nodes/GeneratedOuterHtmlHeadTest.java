package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Parser;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws Exception {
        String outerHtmlHead = "<!--test comment-->";
        Comment comment = new Comment("test comment");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings settings = new Document("").outputSettings();
        comment.outerHtmlHead(sb, 0, settings);
        Assert.assertEquals(outerHtmlHead, sb.toString());
    }

}