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
public class GeneratedIsBlank_GivenTextNode_ReturnsCorrectValue {

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
    public void isBlank_GivenTextNode_ReturnsCorrectValue() {
        TextNode textNode = textNode("");
        assertTrue(textNode.isBlank());

        textNode = textNode("   ");
        assertTrue(textNode.isBlank());

        textNode = textNode("Hello World!");
        assertFalse(textNode.isBlank());
    }

}