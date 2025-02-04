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
public class GeneratedCreateTextNode_GivenText_ReturnsTextNode {

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
    public void createTextNode_GivenText_ReturnsTextNode() {
        TextNode textNode = textNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

}