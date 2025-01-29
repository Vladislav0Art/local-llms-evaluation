package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTestOuterHtmlTail {

    private TextNode node;
    private Document document;

    @Before
    public void setup() {
        document = new Document();
        when(document.append()).thenReturn(document);
        node = new TextNode("Hello World");
    }

    @Test
    public void testOuterHtmlTail() {
        // Arrange
        String expected = "<head></head><body></body>";
        when(node.outerHtmlTail(any(Appendable.class), any(int.class), any(Document.OutputSettings.class))).thenReturn(expected);

        // Act
        String result = node.outerHtmlTail(document, 0, Document.OutputSettings.PRESERVEWhiteSpace);

        // Assert
        assertEquals(expected, result);
    }

}