package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.util.*;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode textNode = new TextNode("<p>Hello <span>world!</span></p>");
        Document doc = document();
        Appendable accum = appendStack(doc, "\n", accum);
        assertEquals("Hello<sup> world! </sup>", String.toString(accum), "expected contents");
    }

}