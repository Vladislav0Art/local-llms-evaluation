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
public class GeneratedGetWholeTextReturnsOriginalText {

    @Mock
    private LeafNode leafNodeMock;

    public TextNode textNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void getWholeTextReturnsOriginalText() {
        String originalText = "test";
        when(leafNodeMock.text()).thenReturn(originalText);
        String result = textNode(originalText).getWholeText();
        assertEquals(originalText, result);
    }

}