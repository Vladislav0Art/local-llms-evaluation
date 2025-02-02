package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNodeOuterHtmlTailTest]

Test {

    @Test
    public void [TextNodeOuterHtmlTailTest]Test() throws IOException {
        TextNode node = new TextNode("");
        Appendable output = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        node.outerHtmlTail(output, 0, settings);
        // No output is generated here.
    }

}