package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedClone_CloneCreatesNewTextNodeWithSameText {

    @Mock
    private LeafNode mockLeafNode;

    @Test
    public void clone_CloneCreatesNewTextNodeWithSameText() {
        String originalText = "original text";
        TextNode textNode = new TextNode(originalText);
        TextNode clonedTextNode = textNode.clone();
        assertEquals(originalText, clonedTextNode.text());
    }

}