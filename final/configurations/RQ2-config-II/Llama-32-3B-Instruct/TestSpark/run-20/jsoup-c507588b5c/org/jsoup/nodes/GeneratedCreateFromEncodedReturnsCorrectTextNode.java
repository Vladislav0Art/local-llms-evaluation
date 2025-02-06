package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedCreateFromEncodedReturnsCorrectTextNode {

    @Test
    public void createFromEncodedReturnsCorrectTextNode() {
        TextNode textNode = TextNode.createFromEncoded("text");
        assertNotNull(textNode);
        assertEquals("text", textNode.text());
    }

}