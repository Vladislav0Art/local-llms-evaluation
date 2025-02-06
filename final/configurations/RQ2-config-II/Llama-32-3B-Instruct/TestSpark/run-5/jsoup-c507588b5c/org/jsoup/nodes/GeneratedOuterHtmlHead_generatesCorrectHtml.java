package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHead_generatesCorrectHtml {

    @Test
    public void outerHtmlHead_generatesCorrectHtml() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 1;
        Document.OutputSettings settings = null;

        TextNode node = new TextNode("<script>alert('test')</script>");
        node.outerHtmlHead(accum, depth, settings);
        assertTrue(outContent.toString().contains("<p class=\"result\"><script>"));
    }

}