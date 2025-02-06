package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTail_generatesCorrectHtml {

    @Test
    public void outerHtmlTail_generatesCorrectHtml() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 1;

        TextNode node = new TextNode("test");
        Document.OutputSettings settings = null;

        node.outerHtmlTail(accum, depth, settings);
        assertTrue(outContent.toString().contains("<p class=\"result\">test</p>"));
    }

}