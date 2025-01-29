package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import static org.mockito.Mockito.*;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() {
        TextNode node = new TextNode("");
        when(node.stripLeadingWhitespace()).thenReturn(new StringBuilder());
    }

}