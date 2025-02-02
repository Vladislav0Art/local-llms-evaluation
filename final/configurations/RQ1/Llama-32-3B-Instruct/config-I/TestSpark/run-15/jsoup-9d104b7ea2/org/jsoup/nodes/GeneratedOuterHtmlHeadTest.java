package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        StringBuilder builder = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true);
        TextNode node = new TextNode("  ");
        node.outerHtmlHead(builder, 0, out);
        assertTrue(builder.toString().contains("<br>"));
    }

}