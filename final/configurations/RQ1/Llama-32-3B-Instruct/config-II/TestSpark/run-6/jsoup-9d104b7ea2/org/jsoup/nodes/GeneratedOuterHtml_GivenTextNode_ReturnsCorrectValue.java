package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtml_GivenTextNode_ReturnsCorrectValue {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element sibling;

    @Mock
    private Document parentDocument;

    @Mock
    private Appendable accum;

    public TextNode textNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void outerHtml_GivenTextNode_ReturnsCorrectValue() throws IOException {
        TextNode textNode = textNode("Hello World!");
        when(parentNode.tag()).thenReturn("p");

        String html = textNode.outerHtml();
        assertTrue(html.contains("<p>"));
        assertTrue(html.contains("</p>"));
    }

}