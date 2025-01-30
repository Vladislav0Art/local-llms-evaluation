package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode node = new TextNode("Hello");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlTail(accum, 0, new OutputSettings());
        assertEquals(accum.toString(), "");
    }

}