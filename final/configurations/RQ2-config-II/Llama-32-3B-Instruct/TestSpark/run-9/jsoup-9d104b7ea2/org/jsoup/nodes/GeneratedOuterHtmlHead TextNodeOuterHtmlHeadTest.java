package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedOuterHtmlHead TextNodeOuterHtmlHeadTest {

    @Test
    public void outerHtmlHead

    TextNodeOuterHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("<p>Hello World!</p>");
        Appendable appendable = new StringBuilder();
        Document.OutputSettings outputSettings = null;
        textNode.outerHtmlHead(appendable, 0, outputSettings);
        assertEquals("<p>", appendable.toString());
    }

}