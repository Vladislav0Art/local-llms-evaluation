package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHeadMethodTest {

    @Test
    public void outerHtmlHeadMethodTest() throws IOException {
        String originalHtml = "<div>Hello World</div>";
        Document.OutputSettings outSettings = new Document.OutputSettings(true);

        TextNode textNode = new TextNode(originalHtml);
        Appendable appendable = new StringBuilder();

        textNode.outerHtmlHead(appendable, 0, outSettings);

        assertEquals("<div><span> Hello World</span></div>", appendable.toString());
    }

}