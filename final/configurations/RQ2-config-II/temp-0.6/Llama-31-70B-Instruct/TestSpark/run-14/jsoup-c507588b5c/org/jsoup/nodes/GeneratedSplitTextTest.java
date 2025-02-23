package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("foobar");
        TextNode newNode = textNode.splitText(3);
        assertEquals("foo", textNode.getWholeText());
        assertEquals("bar", newNode.getWholeText());
    }

}