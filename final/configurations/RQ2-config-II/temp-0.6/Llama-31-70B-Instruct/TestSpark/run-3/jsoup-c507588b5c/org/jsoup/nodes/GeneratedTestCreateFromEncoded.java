package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() {
        TextNode textNode = TextNode.createFromEncoded("&lt;div&gt;");
        assertEquals("&lt;div&gt;", textNode.coreValue());
    }

}