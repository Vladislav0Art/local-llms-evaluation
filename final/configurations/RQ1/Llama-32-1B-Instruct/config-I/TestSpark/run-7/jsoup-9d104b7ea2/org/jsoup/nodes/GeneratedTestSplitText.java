package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() throws IOException {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        node = node.splitText(5); // Split at the 6th character (index 5)
        Assert.assertFalse(node.text().isEmpty());
        Assert.assertTrue(node.text().length() == 5);
    }

}