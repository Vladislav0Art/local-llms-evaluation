package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestTextSetText {

    @Test
    public void testTextSetText() {
        TextNode textNode = new TextNode("Test");
        textNode.text("Test2");
        assertEquals("Test2", textNode.text());
    }

}