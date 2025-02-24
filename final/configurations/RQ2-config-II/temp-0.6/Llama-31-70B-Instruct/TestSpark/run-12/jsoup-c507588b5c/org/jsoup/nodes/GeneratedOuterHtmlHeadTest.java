package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("text");
        StringBuilder sb = new StringBuilder();
        try {
            textNode.outerHtmlHead(sb, 1, new Document.OutputSettings());
        } catch (IOException e) {
            fail("IOException thrown");
        }
        assertEquals("text", sb.toString());
    }

}