package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTestTrimLeadingWhitespace {

    @Test
    public void testTrimLeadingWhitespace() {
        String text = "   Hello   ";
        TextNode node = new TextNode(text);
        Assert.assertTrue(TextUtil.stripLeadingWhitespace(node.text()).equals("Hello"));
    }

}