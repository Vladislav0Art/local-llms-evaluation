package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedSplitTextReturnsNewTextNodeWhenOffsetIsLessThanLength {

    @Test
    public void splitTextReturnsNewTextNodeWhenOffsetIsLessThanLength() {
        TextNode textNode = new TextNode("text");
        TextNode newTextNode = textNode.splitText(3);
        assertNotNull(newTextNode);
        assertEquals(4, newTextNode.text().length());
    }

}