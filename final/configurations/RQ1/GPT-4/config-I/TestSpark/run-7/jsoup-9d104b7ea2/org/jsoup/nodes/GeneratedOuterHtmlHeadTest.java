package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("Hello");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlHead(accum, 0, new OutputSettings());
        assertEquals(accum.toString(), "Hello");
    }

}