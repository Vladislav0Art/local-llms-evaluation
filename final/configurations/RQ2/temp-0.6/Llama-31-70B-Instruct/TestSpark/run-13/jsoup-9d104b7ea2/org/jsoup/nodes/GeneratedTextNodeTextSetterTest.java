package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTextNodeTextSetterTest {

    @Test
    public void TextNodeTextSetterTest() {
        TextNode textNode = new TextNode("text");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

}