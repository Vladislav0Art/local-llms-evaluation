package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        // Test that the head is created correctly, with leading and trailing whitespace removed.
        TextNode textNode = new TextNode("Hello World!");
        String result = textNode.outerHtmlHead(Appendable.get(), 0, Document.OutputSettings.prettyPrint());
        assertEquals("<text>", result);
    }

}