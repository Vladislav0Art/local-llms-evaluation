package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNodeOuterHtmlHeadTest]

Test {

    @Test
    public void [TextNodeOuterHtmlHeadTest]Test() throws IOException {
        TextNode node = new TextNode("");
        Appendable output = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        node.outerHtmlHead(output, 0, settings);
        assertEquals("<p></p>", output.toString());
    }

}