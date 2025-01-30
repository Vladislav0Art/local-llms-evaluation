package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("data");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        StringBuilder accum = new StringBuilder();
        try {
            comment.outerHtmlTail(accum, 0, outputSettings);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("", accum.toString());
    }

}