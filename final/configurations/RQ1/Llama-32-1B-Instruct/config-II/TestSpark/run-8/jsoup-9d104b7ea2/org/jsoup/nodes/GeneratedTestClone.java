package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.util.*;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode textNode = new TextNode("<p>Hello <span>world!</span></p>");
        Document doc = document();
        Appendable accum = appendStack(doc, "\n", accum);
        TextNode clonedTextNode = (TextNode) textNode.clone();
        assertEquals(textNode, clonedTextNode);
    }

}