package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestOuterHtmlTail {

    public Node createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        // Create a mock DocumentOutputSettings object to be used for testing
        Document.OutputSettings settings = mock(Document.OutputSettings.class);
        Document document = new Document();
        document.setOutputSettings(settings);

        Node node = new TextNode(document, "This is a sample text.");
        when(node.outerHtmlTail(any(Appendable.class), anyInt(), any.Document.OutputSettings.class)).thenReturn("Sample");
        assertEquals("Sample", node.outerHtmlTail(null, 0, null).toString());
    }

}