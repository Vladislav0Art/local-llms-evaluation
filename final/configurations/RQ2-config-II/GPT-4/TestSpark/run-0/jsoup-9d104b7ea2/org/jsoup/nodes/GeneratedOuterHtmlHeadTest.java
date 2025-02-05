package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void OuterHtmlHeadTest() throws IOException {
        String text = "test text";
        TextNode textNode = new TextNode(text);
        StringBuilder stringBuilder = new StringBuilder();
        textNode.outerHtmlHead(stringBuilder, 0, new Document.OutputSettings());
        Assert.assertEquals(text, stringBuilder.toString());
    }

}