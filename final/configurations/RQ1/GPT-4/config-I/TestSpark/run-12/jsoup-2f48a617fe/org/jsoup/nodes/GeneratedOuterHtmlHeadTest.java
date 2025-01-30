package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("data");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        outputSettings.prettyPrint(true);
        StringBuilder accum = new StringBuilder();
        try {
            comment.outerHtmlHead(accum, 0, outputSettings);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String expectedHtmlText = "<!--data-->";
        Assert.assertEquals(expectedHtmlText, accum.toString());
    }

}