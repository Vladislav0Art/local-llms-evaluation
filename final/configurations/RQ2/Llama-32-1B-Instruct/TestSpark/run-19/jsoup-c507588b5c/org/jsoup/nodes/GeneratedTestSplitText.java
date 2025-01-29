package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String text = "Hello, World!";
        int offset = 10;
        Element element = Mockito.mock(Element.class);
        TextNode node = new TextNode(text);
        Mockito.when(element.getWholeText()).thenReturn(text);
        assertEquals(3, node.splitText(offset).getWholeText().length());
    }

}