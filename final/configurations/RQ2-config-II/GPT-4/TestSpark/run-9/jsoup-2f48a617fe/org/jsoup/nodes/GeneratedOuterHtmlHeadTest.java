package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        String data = "Test Comment";
        Comment comment = new Comment(data);
        StringBuilder accum = new StringBuilder();

        comment.outerHtmlHead(accum, 0, new Document.OutputSettings());

        Assert.assertEquals("<!--Test Comment-->", accum.toString());
    }

}