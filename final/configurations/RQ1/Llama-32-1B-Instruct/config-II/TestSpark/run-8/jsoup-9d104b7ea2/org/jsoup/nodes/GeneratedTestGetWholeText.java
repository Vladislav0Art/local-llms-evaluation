package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.util.*;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("<p>Hello</p>");
        assertEquals("Hello", textNode.getWholeText());
    }

}