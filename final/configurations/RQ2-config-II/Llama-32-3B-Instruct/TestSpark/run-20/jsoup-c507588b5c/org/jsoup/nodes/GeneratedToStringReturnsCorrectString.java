package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedToStringReturnsCorrectString {

    @Test
    public void toStringReturnsCorrectString() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.toString());
    }

}