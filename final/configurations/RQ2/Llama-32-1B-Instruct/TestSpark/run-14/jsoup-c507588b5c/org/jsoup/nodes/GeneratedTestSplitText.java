package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import static org.mockito.Mockito.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Hello World");
        int offset = 10;
        assertThrows(IndexOutOfBoundsException.class, () -> node.splitText(offset));
    }

}