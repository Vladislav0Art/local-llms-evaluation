package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        StringBuilder builder = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(false);
        TextNode node = new TextNode("ab c");
        node.outerHtmlTail(builder, 0, out);
    }

}