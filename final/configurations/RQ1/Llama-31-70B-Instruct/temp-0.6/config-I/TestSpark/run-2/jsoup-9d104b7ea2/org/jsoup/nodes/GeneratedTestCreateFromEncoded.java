package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() {
        TextNode node = TextNode.createFromEncoded("&lt;test&gt;");
        assertEquals("<test>", node.text());
    }

}