package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedOuterHtmlTailDoesNotOutputAnything {

    @Test
    public void outerHtmlTailDoesNotOutputAnything() throws IOException {
        TextNode node = new TextNode("");
        Appendable accum = new ByteArrayBuilder(1024);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        node.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

}