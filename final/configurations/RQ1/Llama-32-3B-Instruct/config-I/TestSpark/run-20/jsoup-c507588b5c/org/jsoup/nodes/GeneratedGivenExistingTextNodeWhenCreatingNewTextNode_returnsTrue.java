package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGivenExistingTextNodeWhenCreatingNewTextNode_returnsTrue {

    @Test
    public void givenExistingTextNodeWhenCreatingNewTextNode_returnsTrue() {
        String existingText = "Existing Text";
        TextNode existingTextNode = new TextNode(existingText);
        boolean result = existingTextNode.isBlank();
        assertTrue(result);
    }

}