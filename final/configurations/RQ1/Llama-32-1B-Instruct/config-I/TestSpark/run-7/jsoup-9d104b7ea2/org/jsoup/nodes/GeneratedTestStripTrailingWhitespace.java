package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTestStripTrailingWhitespace {

    @Test
    public void testStripTrailingWhitespace() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        Assert.assertFalse(TextUtil.stripTrailingWhitespace(node.text()).equals("World"));
    }

}