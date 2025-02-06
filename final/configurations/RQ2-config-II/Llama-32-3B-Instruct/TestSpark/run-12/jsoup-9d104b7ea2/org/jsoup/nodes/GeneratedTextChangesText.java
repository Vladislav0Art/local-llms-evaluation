package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextChangesText {

    @Mock
    private LeafNode leafNodeMock;

    public TextNode textNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void textChangesText() {
        String originalText = "test";
        String newText = "newText";
        when(leafNodeMock.text()).thenReturn(originalText);
        TextNode textNode = new TextNode(originalText);
        textNode.text(newText);
        assertEquals(newText, textNode.text());
    }

}