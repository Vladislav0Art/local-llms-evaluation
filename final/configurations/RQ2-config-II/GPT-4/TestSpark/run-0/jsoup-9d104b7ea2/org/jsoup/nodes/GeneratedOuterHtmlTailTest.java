package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void OuterHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("");
        StringBuilder stringBuilder = new StringBuilder();
        textNode.outerHtmlTail(stringBuilder, 0, new Document.OutputSettings());
        Assert.assertEquals("", stringBuilder.toString());
    }

}