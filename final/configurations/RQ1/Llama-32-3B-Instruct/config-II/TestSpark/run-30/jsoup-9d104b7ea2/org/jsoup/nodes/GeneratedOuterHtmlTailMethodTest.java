package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTailMethodTest {

    @Test
    public void outerHtmlTailMethodTest() throws IOException {
        String originalHtml = "<div>Hello World</div>";
        Document.OutputSettings outSettings = new Document.OutputSettings(true);

        TextNode textNode = new TextNode(originalHtml);
        Appendable appendable = new StringBuilder();
        int depth = 0;

        textNode.outerHtmlTail(appendable, depth, outSettings);
    }

}