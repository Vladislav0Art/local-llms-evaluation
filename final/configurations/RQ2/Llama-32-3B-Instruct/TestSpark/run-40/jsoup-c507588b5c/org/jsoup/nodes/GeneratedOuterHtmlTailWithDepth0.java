package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlTailWithDepth0 {

    @Test
    public void outerHtmlTailWithDepth0() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("");
        textNode.outerHtmlTail(accum, 0, out);
        // Stub output
    }

}