package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestIsBlank_returnsTrue {

    @Test
    public void testIsBlank_returnsTrue() {
        Node node = new TextNode("   \n");
        assertTrue(node.isBlank());
    }

}