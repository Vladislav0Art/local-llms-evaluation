package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedOuterHtmlHead_GivenAppendableAndDepth_ThrowsIOException {

    @Test
    public void outerHtmlHead_GivenAppendableAndDepth_ThrowsIOException() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        assertThrows(IOException.class, () -> new TextNode().outerHtmlHead(accum, depth, out));
    }

}