package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.util.*;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        TextNode textNode = new TextNode("<p>Hello <span>world!</span></p>");
        Document doc = document();
        Appendable accum = appendStack(doc, "\n", accum);
        outerHtmlHead(accum, 0, doc);
        assertEquals("", String.toString(accum), "expected empty string");

        appendStack(doc, "\n\n", accum);
        textNode.outerHtmlTail(accum, 0, doc);
        assertEquals("Hello<sup> world! </sup>", String.toString(accum), "expected contents");
    }

}