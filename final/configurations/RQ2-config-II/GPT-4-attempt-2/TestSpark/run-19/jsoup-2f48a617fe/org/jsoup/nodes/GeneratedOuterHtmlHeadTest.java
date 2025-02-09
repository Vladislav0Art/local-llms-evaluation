package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("data");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        comment.outerHtmlHead(accum, 0, out);
        Assert.assertTrue(accum.toString().contains("<!--data-->"));
    }

}