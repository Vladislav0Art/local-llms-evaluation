package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.html5.OutputSettings;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedStripLeadingWhitespace {

    @Test
    public void stripLeadingWhitespace() {
        String text = "leading whitespace";
        assertEquals("text", StringUtil.stripLeadingWhitespace(text));
    }

}