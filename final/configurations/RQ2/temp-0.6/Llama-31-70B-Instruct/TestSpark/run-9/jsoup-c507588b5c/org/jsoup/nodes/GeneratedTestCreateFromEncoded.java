package org.jsoup.nodes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() {
        TextNode textNode = TextNode.createFromEncoded("test");
        assertEquals("test", textNode.getWholeText());
    }

}