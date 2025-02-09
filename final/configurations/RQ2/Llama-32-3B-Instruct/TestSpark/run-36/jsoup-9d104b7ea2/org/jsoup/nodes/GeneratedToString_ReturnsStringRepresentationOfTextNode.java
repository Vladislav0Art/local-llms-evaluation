package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedToString_ReturnsStringRepresentationOfTextNode {

    @Mock
    private LeafNode mockLeafNode;

    @Test
    public void toString_ReturnsStringRepresentationOfTextNode() {
        String expectedText = "<tag>text</tag>";
        TextNode textNode = new TextNode(expectedText);
        assertEquals(expectedText, textNode.toString());
    }

}