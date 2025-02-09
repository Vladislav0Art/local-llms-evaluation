package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlank_TextNodeReturnsFalseWhenTextIsNotBlank {

    @Mock
    private LeafNode mockLeafNode;

    @Test
    public void isBlank_TextNodeReturnsFalseWhenTextIsNotBlank() {
        String originalText = "hello world";
        boolean expectedResult = false;
        TextNode textNode = new TextNode(originalText);
        assertTrue(textNode.isBlank());
    }

}