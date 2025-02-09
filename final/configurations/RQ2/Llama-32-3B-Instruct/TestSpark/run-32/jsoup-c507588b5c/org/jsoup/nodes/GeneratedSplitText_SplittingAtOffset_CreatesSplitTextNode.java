package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedSplitText_SplittingAtOffset_CreatesSplitTextNode {

    @Test
    public void splitText_SplittingAtOffset_CreatesSplitTextNode() throws IOException {
        TextNode textNode = new TextNode("HelloWorld");
        TextNode splitTextNode1 = (TextNode) textNode.splitText(0);
        TextNode splitTextNode2 = (TextNode) splitTextNode1.splitText(splitTextNode1.getText().length());
        assertEquals("Hello", splitTextNode1.getText());
        assertEquals("World", splitTextNode2.getText());
    }

}