package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedSplitTextReturnsEmptyTextNodeWhenOffsetIsEqualToLength {

    @Test
    public void splitTextReturnsEmptyTextNodeWhenOffsetIsEqualToLength() {
        TextNode textNode = new TextNode("text");
        TextNode newTextNode = textNode.splitText(textNode.text().length());
        assertNotNull(newTextNode);
        assertEquals(0, newTextNode.text().length());
    }

}