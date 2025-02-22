package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestCreateFromEncoded {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("text");
    }

    @Test
    public void testCreateFromEncoded() {
        TextNode encodedTextNode = TextNode.createFromEncoded("&lt;test&gt;");
        assertEquals("<test>", encodedTextNode.coreValue());
    }

}