package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import static org.mockito.Mockito.*;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello");
        TextNode node2 = (TextNode) node.clone();
        assertNotSame(node1, node2);

        when(node2.text()).thenReturn("World");

        assertEquals("Hello", node2.text());
    }

}