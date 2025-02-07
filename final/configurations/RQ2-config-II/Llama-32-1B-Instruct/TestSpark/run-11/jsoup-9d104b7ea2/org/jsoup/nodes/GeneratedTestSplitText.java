package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        Element element = new Document().createElement("text", "Hello World");
        TextNode node = Mockito.mock(TextNode.class);
        when(node.splitText(0)).thenReturn(new String[]{element.getText(), element.getText()});
        assertEquals(new String[]{"Hello World"}, new java.util.Arrays.asList(element.getText(), element.getText()));
        Mockito.verify(node).splitText(0);
    }

}