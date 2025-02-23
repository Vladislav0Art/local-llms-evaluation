package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() {
        TextNode textNode = TextNode.createFromEncoded("&lt;");
        assertEquals("<", textNode.getWholeText());
    }

}