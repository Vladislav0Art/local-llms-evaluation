package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedText_TextNodeReturnsOriginalText {

    @Mock
    private LeafNode mockLeafNode;

    @Test
    public void text_TextNodeReturnsOriginalText() {
        String originalText = "original text";
        TextNode textNode = new TextNode(originalText);
        assertEquals(originalText, textNode.text());
    }

}