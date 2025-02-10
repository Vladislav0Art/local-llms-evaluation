package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.util.*;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("   ");
        assertEquals(false, textNode.isBlank());
        TextNode blankTextNode = new TextNode("");
        assertEquals(true, blankTextNode.isBlank());
    }

}