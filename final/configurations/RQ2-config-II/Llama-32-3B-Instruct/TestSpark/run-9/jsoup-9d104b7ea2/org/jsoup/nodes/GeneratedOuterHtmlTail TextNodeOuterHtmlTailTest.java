package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedOuterHtmlTail TextNodeOuterHtmlTailTest {

    @Test
    public void outerHtmlTail

    TextNodeOuterHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("<p>Hello World!</p>");
        Appendable appendable = new StringBuilder();
        Document.OutputSettings outputSettings = null;
        textNode.outerHtmlTail(appendable, 0, outputSettings);
        assertEquals("</p>", appendable.toString());
    }

}