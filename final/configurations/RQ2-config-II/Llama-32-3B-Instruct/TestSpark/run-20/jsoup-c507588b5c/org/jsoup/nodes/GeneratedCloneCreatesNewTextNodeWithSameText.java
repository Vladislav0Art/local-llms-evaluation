package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedCloneCreatesNewTextNodeWithSameText {

    @Test
    public void cloneCreatesNewTextNodeWithSameText() {
        TextNode textNode = new TextNode("text");
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(textNode.text(), clonedTextNode.text());
    }

}