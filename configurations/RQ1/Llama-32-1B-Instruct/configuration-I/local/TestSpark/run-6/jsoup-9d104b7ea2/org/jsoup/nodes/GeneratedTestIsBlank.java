package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedTestIsBlank {

    @Mock
    private Document document;

    @Test
    public void testIsBlank() {
        String text = "Hello, world!";
        TextNode node = Mockito.mock(TextNode.class);
        when(node.getText()).thenReturn(text);

        assertTrue(TestUtils.isBlank(node));
    }

}