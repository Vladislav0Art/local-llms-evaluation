package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedOuterHtmlTail_GivenEmptyString_ThrowsIOException {

    @Test
    public void outerHtmlTail_GivenEmptyString_ThrowsIOException() {
        TextNode textNode = new TextNode("");
        try {
            Appendable accum = new StringBuilder();
            Document.OutputSettings out = null;
            textNode.outerHtmlTail(accum, 0, out);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals(null, e.getMessage());
        }
    }

}