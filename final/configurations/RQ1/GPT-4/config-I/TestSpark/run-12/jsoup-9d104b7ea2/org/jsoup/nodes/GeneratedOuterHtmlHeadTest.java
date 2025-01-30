package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode tn = new TextNode("test text");
        StringBuilder sb = new StringBuilder();
        tn.outerHtmlHead(sb, 0, new Document.OutputSettings().prettyPrint(false));
        Assert.assertEquals("test text", sb.toString());
    }

}