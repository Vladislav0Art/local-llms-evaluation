package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Objects;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test");
        Document.OutputSettings outputSettings = Mockito.mock(Document.OutputSettings.class);
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, outputSettings);
        Assert.assertTrue(accum.length() > 0);
    }

}