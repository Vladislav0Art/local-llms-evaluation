package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Generated[TextNodeOuterHtml][NotEmptyText]

Test {

    @Mock
    private Document document;

    public TextNode createTextNode () {
        return new TextNode("Test");
    }

    public String testText () {
        return "Test";
    }

    public TextNode splitText () {
        return createTextNode();
    }

    public TextNode textTextNode () {
        return createTextNode();
    }

    @Test
    public void [TextNodeOuterHtml][NotEmptyText]Test() {
        when(document.getNodeValue()).thenReturn("Test");
        TextNode textNode = createTextNode();
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        document.outerHtmlHead(accum, 0, out);
        assertNotNull(accum);
    }

}