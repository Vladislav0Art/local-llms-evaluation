package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestCreateFromEncoded {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test");
    }

    @Test
    public void testCreateFromEncoded() {
        TextNode newNode = TextNode.createFromEncoded("&lt;");
        assertEquals("<", newNode.getWholeText());
    }

}