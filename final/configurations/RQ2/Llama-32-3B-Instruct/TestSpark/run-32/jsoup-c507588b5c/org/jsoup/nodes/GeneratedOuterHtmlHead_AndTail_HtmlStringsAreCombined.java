package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedOuterHtmlHead_AndTail_HtmlStringsAreCombined {

    @Test
    public void outerHtmlHead_AndTail_HtmlStringsAreCombined() throws IOException {
        TextNode textNode = new TextNode("Hello");
        StringBuilder html = new StringBuilder();
        Appendable appendable = new StringBuffer();
        textNode.outerHtmlHead(appendable, 0, null);
        textNode.outerHtmlTail(appendable, 0, null);
        assertEquals("<p>Hello</p>", html.toString());
    }

}