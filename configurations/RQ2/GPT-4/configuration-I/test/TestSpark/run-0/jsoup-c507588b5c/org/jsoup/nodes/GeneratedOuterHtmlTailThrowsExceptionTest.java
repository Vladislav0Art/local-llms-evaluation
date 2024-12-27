package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;

public class GeneratedOuterHtmlTailThrowsExceptionTest {

    @Test
    public void OuterHtmlTailThrowsExceptionTest() throws IOException {
        Appendable appendable = new StringBuilder();
        TextNode node = new TextNode("");
        node.outerHtmlTail(appendable, 1, new Document.OutputSettings());
    }

}