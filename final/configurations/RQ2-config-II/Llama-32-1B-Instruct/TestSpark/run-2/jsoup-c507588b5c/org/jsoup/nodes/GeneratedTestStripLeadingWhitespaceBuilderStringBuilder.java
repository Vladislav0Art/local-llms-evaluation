package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedTestStripLeadingWhitespaceBuilderStringBuilder {

    @Test
    public void testStripLeadingWhitespaceBuilderStringBuilder() throws Exception {
        StringBuilder sb = new StringBuilder();
        TextNode node = new TextNode("   Hello   World  ");
        node.stripLeadingWhitespace(sb).toString();
        // check that the text is stripped to "Hello World"
    }

}