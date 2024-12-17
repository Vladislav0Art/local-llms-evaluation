package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedClone {

    @Test
    public void clone() {
        TextNode node = new TextNode(HTML);
        TextNode cloned = (TextNode) node.clone();
        assertNotNull(cloned);
        assertEquals(node, cloned);
    }
}

}