package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

public class GeneratedGetOuterHtmlHeadReturnsCorrectContent {

    @Test
    public void getOuterHtmlHeadReturnsCorrectContent() {
        // Stub the DocumentOutputSettings for testing purposes
        String[] expected = {"<root><comment>test</comment></root>", "<root><comment>expected <attribute>value</attribute></root>"};

        Comment comment = new Comment("");
        String result = comment.outerHtmlHead(new org.jsoup.nodes.Document(), 1, new org.jsoup.nodes.Document.OutputSettings());
        assertEquals(expected[0], result);
    }

}