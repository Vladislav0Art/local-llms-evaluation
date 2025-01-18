package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlTailIOExceptionTest {

    // Test for constructor

    @Test
    public void outerHtmlTailIOExceptionTest() throws IOException {
        TextNode tn = new TextNode("test text");
        Appendable appendable = new IOExceptionThrowingAppendable();
        tn.outerHtmlTail(appendable, 0, new Document.OutputSettings());
    }

}