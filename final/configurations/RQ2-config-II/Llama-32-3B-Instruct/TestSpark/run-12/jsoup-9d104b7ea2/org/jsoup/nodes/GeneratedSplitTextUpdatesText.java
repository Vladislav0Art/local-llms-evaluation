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
public class GeneratedSplitTextUpdatesText {

    @Mock
    private LeafNode leafNodeMock;

    public TextNode textNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void splitTextUpdatesText() {
        String originalText = "test";
        when(leafNodeMock.text()).thenReturn(originalText);
        TextNode textNode = new TextNode(originalText);
        int offset = 5;
        String result = textNode.splitText(offset).text();
        assertEquals(originalText.substring(0, offset), result);
    }

}