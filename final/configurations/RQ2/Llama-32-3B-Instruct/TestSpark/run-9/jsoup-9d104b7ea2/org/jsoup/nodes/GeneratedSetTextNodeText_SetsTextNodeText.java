package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedSetTextNodeText_SetsTextNodeText {

    @Test
    public void setTextNodeText_SetsTextNodeText() {
        TextNode textNode = new TextNode();
        textNode.setTextNodeText("newText");
        assertEquals("newText", textNode.text());
    }

}