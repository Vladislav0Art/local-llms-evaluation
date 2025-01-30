package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode tn = new TextNode("test text");
        StringBuilder sb = new StringBuilder();
        tn.outerHtmlTail(sb, 0, new Document.OutputSettings().prettyPrint(false));
        // As outerHtmlTail function does not change 'sb', so it will remain empty
        Assert.assertEquals("", sb.toString());
    }

}