package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        try {
            comment.outerHtmlHead(accum, 0, out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(accum.toString().contains("test"));  // verify it contains the comment
    }

}