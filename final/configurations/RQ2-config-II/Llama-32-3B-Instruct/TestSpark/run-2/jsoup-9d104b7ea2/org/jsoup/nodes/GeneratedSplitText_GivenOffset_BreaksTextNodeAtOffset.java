package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedSplitText_GivenOffset_BreaksTextNodeAtOffset {

    @Test
    public void splitText_GivenOffset_BreaksTextNodeAtOffset() {
        TextNode textNode = new TextNode("Hello World");
        String expectedHtml = "<p>Hello <wbr>World</p>";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals(expectedHtml, accum.toString());
    }

}