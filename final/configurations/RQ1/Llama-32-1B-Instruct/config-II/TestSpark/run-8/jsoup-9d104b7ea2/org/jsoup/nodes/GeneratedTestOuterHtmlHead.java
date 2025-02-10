package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.util.*;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        TextNode textNode = new TextNode("<p>Hello <span>world!</span></p>");
        Document doc = document();
        Appendable accum = appendStack(doc, "html");
        outerHtmlHead(accum, 0, doc);
        assertEquals("<p>Hello<sup> world! </sup></p>", String.toString(accum), "expected contents");

        appendStack(doc, "\n", accum);
        textNode.outerHtmlHead(accum, 0, doc);
        assertEquals("<p>Hello</p><span>world!</span></p>", String.toString(accum), "expected contents");
    }

}