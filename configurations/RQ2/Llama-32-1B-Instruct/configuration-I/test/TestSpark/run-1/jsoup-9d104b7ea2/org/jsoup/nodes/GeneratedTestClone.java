package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode clonedNode = (TextNode) node.clone();
        assertEquals(text, getTextNode(clonedNode).getText());
        assertEquals("", getWholeText(clonedNode).toString());
        assertEquals(10, getNodeIsBlank(clonedNode).length());
    }

}