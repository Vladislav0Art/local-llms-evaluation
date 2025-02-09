package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadWithDepth0 {

    @Test
    public void outerHtmlHeadWithDepth0() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("");
        textNode.outerHtmlHead(accum, 0, out);
        // Stub output
    }

}